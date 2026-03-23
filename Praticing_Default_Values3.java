public class Praticing_Default_Values3 {
    /*11.Create a class BankAccount with variables:
->accountHolderName
->balance
->activeStatus
Create three objects and print default values.*/
String account_holder_name;
int balance;
String active_status;
/*12.Create a class Product with variables:
->productName
->productPrice
->available
Create three objects and display default values.*/
String product_name;
String product_Price;
String avaliable;
/*13.Create a class Course with variables:
->courseName
->duration
->fee
Create three objects and print default values.*/
String course_name;
String duration;
short fee;
/*14.Create a class Movie with variables:
->movieName
->rating
->releaseYear
Create three objects and display default values.*/
String movie_name;
String rating;
byte release_Year;
/*15.Create a class Library with variables:
libraryName
totalBooks
Create three objects and print default values.*/
String library_name;
byte rotal_books;
String books_geners;
public static void main(String[] args) {
    Praticing_Default_Values3 default_values=new Praticing_Default_Values3();
    System.out.println("default account holder name is: "+default_values.account_holder_name);
    System.out.println("default balance is: "+default_values.balance);
    System.out.println("default active status is: "+default_values.active_status);
    Praticing_Default_Values3 product=new Praticing_Default_Values3();
    System.out.println("default product name is: "+product.product_name);
    System.out.println("default product price is: "+product.product_Price);
    System.out.println("default avaliable is: "+product.avaliable);
    Praticing_Default_Values3 course=new Praticing_Default_Values3();
    System.out.println("default course name "+course.course_name);
    System.out.println("default duration is: "+course.duration);
    System.out.println("default fee is: "+course.fee);
    Praticing_Default_Values3 movie=new Praticing_Default_Values3();
    System.out.println("default movie name is: "+movie.movie_name);
    System.out.println("default rating is: "+movie.rating);
    System.out.println("default releasing year is: "+movie.release_Year);
    Praticing_Default_Values3 library1=new Praticing_Default_Values3();
    System.out.println("default library name is: "+library1.library_name);
    Praticing_Default_Values3 library2=new Praticing_Default_Values3();
    System.out.println("default total books is: "+library1.rotal_books);
    Praticing_Default_Values3 library3=new Praticing_Default_Values3();
    System.out.println("default total books is: "+library1.books_geners);
}
    
}