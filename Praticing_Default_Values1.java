public class Praticing_Default_Values1 {
    /*1.Create a class Student with variables:
->name
->age
Create one object and print the default values.*/
    String name;
    long age;
/*2.Create a class Employee with variables:
->id
->salary
Create one object and display default values.*/
long id;
int salary;
/*3.Create a class Car with variables:
->brand
->price
Create one object and print default values.*/
short price;
String brand;
/*4.Create a class Mobile with variables:
->model
->storage
->price
Create one object and display default values.*/
String model;
String storage;
byte price1;
/*5.Create a class Book with variables:
->title
->author
->price
Create one object and print default values*/
String title;
String author;
byte price2;
    public static void main(String[] args) {
            Praticing_Default_Values1 student =new Praticing_Default_Values1();
            System.out.println("default  student name: "+student.name);
            System.out.println("default student age: "+student.age);
            Praticing_Default_Values1 Employee=new Praticing_Default_Values1();
            System.out.println("default employee id: "+Employee.id);
            System.out.println("default employee salary "+Employee.salary);
            Praticing_Default_Values1 car=new Praticing_Default_Values1();
            System.out.println("default price is: "+car.price);
            System.out.println("default brand is:"+car.brand);
            Praticing_Default_Values1 mobile=new Praticing_Default_Values1();
            System.out.println("default model is: "+mobile.model);
            System.out.println("default storage is: "+mobile.storage);
            System.out.println("default price is: "+mobile.price1);
            Praticing_Default_Values1 book=new Praticing_Default_Values1();
            System.out.println("default title is: "+book.title);
            System.out.println("default author is: "+book.author);
            System.out.println("default price is: "+book.price2);
    }
}