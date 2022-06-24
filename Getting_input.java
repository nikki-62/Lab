import java.util.Scanner; //import scanner 
class Getting_input{


       public static void main(String[]args){
          
          System.out.println("Enter Your Name: ");           //getting input from user
           Scanner sc = new Scanner(System.in);               //System.in is a standard input stream
           String Name = sc.next();                            //reads string
          System.out.println("Hello " + Name + " Have a good day");
}
}
