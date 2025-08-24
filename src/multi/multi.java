package multi;


	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class multi {
		public static void main(String[] args) {

			person p1 = new person("Asma", 12345678, new Date(2000, 12, 2));
			System.out.println(p1);

			p1 = new Employee("sathi", 86547293, new Date(1995, 05, 07), "Sales", 45000);
			System.out.println(p1);

			p1 = new Employee2("Madhu", 126294946, new Date(1988, 15, 02), "Account", 85000, 200,"Signing Authority");
			System.out.println(p1);
		}

	}


