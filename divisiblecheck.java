import java.util.Scanner;
class divisiblecheck{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter num:"+ n);
    if(n%5==0 && n%11==0){
      System.out.println("the number is divisible by both 5 and 11");
    }
    else{
      System.out.println("Not divisible by 5 ann 11");
    }
  }
}