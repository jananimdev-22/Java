import java.util.Scanner;
class allexcept{
  public static void main(String[] args){
    try{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array:");
      int arr[]=new int[5];
      for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(+arr[3]);
      System.out.println("Enter A:");
      int a=sc.nextInt();
      System.out.println("Enter B:");
      int b=sc.nextInt();
      int c=a/b;
      System.out.println("The division is"+ c);
      System.out.println("Enetr a number:");
      String a1=sc.next();
      int a2=Integer.parseInt(a1);
    }
    catch(ArithmeticException e){
      System.out.println("Arithmetic exception occured");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array out of index");
    }
    catch(NumberFormatException e){
      System.out.println("Number format exception occured");
    }}}
    
   
      
      


