import java.util.Scanner;
class greater_num{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Enter number:"+a);
    System.out.println("Enter number:"+b);
    if (a>b){
      System.out.println("a is greater");
    }
    else{
      System.out.println("b is greater");
    }
  }
}
        