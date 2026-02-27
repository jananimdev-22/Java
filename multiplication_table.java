import java.util.Scanner;
class multiplication_table{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    System.out.println("---Multiplication Table---");
    System.out.println("Enter a number:" +n);
    for(i=1;i<11;i++){
      System.out.println(n+"x"+i+"="+(n*i));
    }
  }
}
    
    