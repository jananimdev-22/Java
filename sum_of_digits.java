import java.util.Scanner;
class sum_of_digits{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println("Enter number:" + num);
    int sum=0;
    while(num!=0){
      sum=sum+(num%10);
      num=num/10;
    }
    System.out.println("Sum is: " +sum);
  }
}