import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { placementService } from './placement.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'placementservice';
  PlacementDetails: any = null;
  placementToUpdate = {
    id: null,
    name: '',
    date: '',
    qualification: '',
    year: ''  
  };

  constructor(private placementService: placementService) {}

  ngOnInit() {
    this.getPlacementDetails();
  }

  register(registerForm: NgForm) {
    if (registerForm.valid) {
      // Convert year to number before sending
      const formData = {
        ...registerForm.value,
        year: parseInt(registerForm.value.year, 10)
      };

      this.placementService.registerPlacement(formData).subscribe(
        (resp: any) => {
          console.log(resp);
          registerForm.reset();
          this.getPlacementDetails();
        },
        (err: any) => {
          console.log(err);
        }
      );
    }
  }

  getPlacementDetails() {
  this.placementService.getPlacement().subscribe(
    (resp: any) => {
      console.log("Get Placement Response:", resp);

      if (resp._embedded && resp._embedded.placements) {
        // If backend is Spring Data REST style
        this.PlacementDetails = resp._embedded.placements  || [];
      } else {
        // If backend just returns a plain array
        this.PlacementDetails = resp;
      }
    },
    (err: any) => {
      console.log("Get Placement Error:", err);
    }
  );
}


  deletePlacement(Placement: any) {
    this.placementService.deletePlacement(Placement.id).subscribe(
      (resp: any) => {
        console.log(resp);
        this.getPlacementDetails();
      },
      (err: any) => {
        console.log(err);
      }
    );
  }

  edit(Placement: any) {
    this.placementToUpdate = { 
      ...Placement, 
      date: new Date(Placement.date).toISOString().substring(0, 10),
      year: Placement.year  // keep year as number (or string if coming from backend)
    };
  }

  updatePlacement() {
    // Convert year to number before updating
    const updatedData = {
      ...this.placementToUpdate,
      year: parseInt(this.placementToUpdate.year, 10)
    };

    this.placementService.updatePlacement(updatedData).subscribe(
      (resp: any) => {
        console.log(resp);
        this.getPlacementDetails();
      },
      (err: any) => {
        console.log(err);
      }
    );
  }
}
