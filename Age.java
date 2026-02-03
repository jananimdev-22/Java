import java.util.Scanner;
class vote{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int age;
    age=sc.nextInt();
    System.out.println("Enter age: "+age);
    if(age>=18){
      System.out.println("Eligible to vote");
    }
    else{
      System.out.println("Not eligible to vote");
    }
  }}
    