import java.util.Scanner;
class Getting_input{


       public static void main(String[]args){
          
          System.out.println("Enter Your Name: ");
           Scanner sc = new Scanner(System.in);
           String Name = sc.next();
          System.out.println("Hello " + Name + " Have a good day");
}
}