import java.util.Scanner;
class Student{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    int rollno=sc.nextInt();
    int mark1=sc.nextInt();
    int mark2=sc.nextInt();
    int mark3=sc.nextInt();
    int total;
    total=mark1+mark2+mark3;
    System.out.println("Name: "+name);
    System.out.println("Rollno: "+rollno);
    System.out.println("Enter mark1: "+mark1);
    System.out.println("Enter mark2: "+mark2);
    System.out.println("Enter mark3: "+mark3);
    System.out.println("Total: "+total);
  }
}
    

