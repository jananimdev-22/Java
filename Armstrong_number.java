import java.util.Scanner;
class Armstrong_number{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println("Enter number:" + num);
    int original=num;
    int sum=0;
    while(num!=0){
      int digit=num%10;
      sum=sum+(digit*digit*digit);
      num=num/10;
    }
    if(sum==original){
      System.out.println("Armstrong");
    }
    else{
      System.out.println("Not Armstrong");
    }
  }
}