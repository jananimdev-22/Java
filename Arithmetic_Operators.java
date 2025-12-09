import java.util.Scanner;
public class Arithmetic_Operators{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
    a=sc.nextInt();
    b=sc.nextInt();
    int c;
    c=a+b;
    int d;
    d=a-b;
    int e;
    e=a*b;
    int f;
    f=a/b;
    int x;
    x=a%b;
    
    float z;
    z=a/b;
    System.out.println("Addition: "+c);
    System.out.println("Subtraction: "+d);
    System.out.println("Multiplication: "+e);
    System.out.println("Division: "+f);
    System.out.println("Modulus: "+x);
    
    System.out.println("Division float type: "+z);
    
  }
}
    