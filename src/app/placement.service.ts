import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class placementService {
  private baseUrl = 'http://localhost:8085/placement'; // adjust to your backend

  constructor(private http: HttpClient) {}

  getPlacement() {
    return this.http.get(this.baseUrl);
  }

  registerPlacement(placement: any) {
    return this.http.post(this.baseUrl, placement);
  }

  updatePlacement(placement: any) {
    return this.http.put(`${this.baseUrl}/${placement.id}`, placement);
  }

  deletePlacement(id: number) {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }
}

