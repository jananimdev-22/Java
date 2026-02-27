import java.util.Scanner;
class array_e{
  public static void main(String[] args){
    try {   
            
            int arr[] = new int[5];

            arr[7] = 5;   // ArrayIndexOutOfBoundsException
Scanner sc=new Scanner(System.in);
            int b = sc.nextInt();
            int a = 10 / b;   // ArithmeticException

        }
    catch(ArithmeticException e){
      System.out.println("Division by zero");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array index value is wrong");
    }
    finally{
      System.out.println("gud byeeee");
    }
  }
}