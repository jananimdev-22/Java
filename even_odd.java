import java.util.Scanner;
class even_odd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
    System.out.println("Enter number:"+a);
    if (a%2==0){
      System.out.println("a is even");
    }
    else{
      System.out.println("a is odd");
    }
  }
}
        