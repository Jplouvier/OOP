package oop;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Applicatie is gestart");
		
		Product p = new Product();
		p.name = "TV";
		p.printName();
		
		Product p2 = new Product();
		p2.name = "Wasmachine";
		
		
		
		Trainee id = new Trainee();
		id.name = "Jos";
		id.age = 28;
		id.programmingExperience = true;
		id.study = "AI";
		id.programmingLanguage = "Java";
		id.printPersonalInfo();
		id.printProgrammingExperience();
		Trainee id2 = new Trainee();
		int increaseAge = id.increaseAge(2);
		System.out.println(increaseAge);
		
		Trainee id4 = new Trainee("Pietje");
		System.out.println(id4.name);
		id4 = new Trainee("Pietje", 25);
		System.out.println(id4.name+" "+id4.age );
		
		id.changeLanguage("python");
		System.out.println(id.programmingLanguage);
		
		id2.name = "Just";
		id2.age = 30;
		id2.programmingExperience = true;
		id2.study = "BME";
		id2.programmingLanguage = "MATLAB";
		id2.printPersonalInfo();
		id2.printProgrammingExperience();
		Trainee id3 = new Trainee();
		id3.name = "Winsome";
		id3.age = 23;
		id3.programmingExperience = true;
		id3.study = "Informationscience";
		id3.programmingLanguage = "Python";
		id3.printPersonalInfo();
		id3.printProgrammingExperience();
		
	}

}
