import java.util.Scanner;
class pos_neg{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("Enter value:" +a);
    if(a>0){
      System.out.println("Positive");
    }
    else if(a<0){
      System.out.println("Negative");
    }
    else{
      System.out.println("Zero");}}}
        