import java.util.Scanner;
class calculator{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Enter a:"+ a);
    System.out.println("Enter b:"+ b);
    char operator;
    operator=sc.next().charAt(0);
    switch(operator){
      case '+':
        System.out.println("Result=" +(a+b));
        break;
      case '-':
        System.out.println("Result=" +(a-b));
        break;
      case '*':
        System.out.println("Result=" +(a*b));
        break;
      case '/':
        System.out.println("Result=" +(a/b));
        break;
      default:
        System.out.println("Invalid operator");
    }
  }
}
        

    
        
    