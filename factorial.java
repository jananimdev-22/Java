import java.util.Scanner;
class factorial{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println("Enter number:" +num);
    int fact = 1;
    int i = 1;
    while(i <= num)  {
      if ((num==1)||(num==0)){
        fact=i;
      }
      else{
       fact = fact * i;
       i++;
      }
    }
    System.out.println("Factorial is :" +fact);
  }
}










