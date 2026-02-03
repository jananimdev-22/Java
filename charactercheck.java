import java.util.Scanner;
class charactercheck{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String x=sc.next();
    System.out.println("Enter a character:"+ x);
    if ("aeiouAEIOU".contains(x)){
      System.out.println("It is a vowel");
    }
    else{
      System.out.println("It is a consonant");
    }
  }
}