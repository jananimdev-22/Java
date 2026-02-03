import java.util.Scanner;
class prime_num{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    System.out.println("Enter num:" +N);
    int num=2;
    do{
      int count=0;
      int i=1;
      do{
        if(num%i==0){
          count++;
        }
        i++;
      }
      while(i<=num);
      if(count==2){
        System.out.println(num);
      }
      num++;
    }while (num<=N);
  }
}