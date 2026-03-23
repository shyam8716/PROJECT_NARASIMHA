public class Praticing_Default_Values2 {
    /*6.Create a class Laptop with variables:
->brand
->ram
->processor
Create two objects and print default values.*/
String brand;
int ram;
String processor;
/*7.Create a class Teacher with variables:
->teacherName
->subject
->experience
Create two objects and display default values.*/
String teacher_name;
String subject;
short experience;
/*8.Create a class City with variables:
->cityName
->population
Create two objects and print default values.*/
String city_name;
long population;
/*9.Create a class Hospital with variables:
->hospitalName
->numberOfDoctors
Create two objects and display default values*/
String hospital_name;
long number_of_doctors;
/*10.Create a class Vehicle with variables:
->vehicleName
->speed
->mileage
Create two objects and print default values.*/
String vehicle_name;
int speed;
String mileage;
public static void main(String[] args) {
    Praticing_Default_Values2 laptop=new Praticing_Default_Values2();
    System.out.println("default brand is: "+laptop.brand);
    System.out.println("default ram is: "+laptop.ram);
    System.out.println("default processor is: "+laptop.processor);
    Praticing_Default_Values2 teacher=new Praticing_Default_Values2();
    System.out.println("default teacher name: "+teacher.teacher_name);
    System.out.println("default subject is: "+teacher.subject);
    System.out.println("default experience is: "+teacher.experience);
    Praticing_Default_Values2 city=new Praticing_Default_Values2();
    System.out.println("default city name is: "+city.city_name);
    System.out.println("default population is: "+city.population);
    Praticing_Default_Values2 hospital=new Praticing_Default_Values2();
    System.out.println("default doctor name is: "+hospital.hospital_name);
    System.out.println("default number of doctors are: "+hospital.number_of_doctors);
    Praticing_Default_Values2 vehicle=new Praticing_Default_Values2();
    System.out.println("default vehicle name is "+vehicle.vehicle_name);
    System.out.println("default vehicle speed is: "+vehicle.speed);
    Praticing_Default_Values2 vehicle2=new Praticing_Default_Values2();
    System.out.println("default mileage is: "+vehicle2.mileage);
}
}