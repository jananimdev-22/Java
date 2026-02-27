import java.util.Scanner;
class palindrome{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println("Enter a num:" +num);
    int original=num;
    int rev=0;
    while(num!=0){
      int digit=num%10;
      rev=rev*10+digit;
      num=num/10;
    }
    if (original==rev){
      System.out.println("Palindrome number");
    }
    else{
      System.out.println("Not palindrome");
    }
  }
}