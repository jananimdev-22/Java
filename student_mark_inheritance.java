import java.util.Scanner;
class student{
 String name;
 int rollno;
 String dept;
 student(String a,int b,String c){
   name=a;
   rollno=b;
   dept=c;
 }
 void disp1(){
   System.out.println("Name:"+ name);
   System.out.println("Rollno:"+ rollno);
   System.out.println("Department:"+ dept);
 }
}
class mark extends student{
  int mark1,mark2,mark3,total;
  float avg;
  String res;
  mark(String nm,int roll,String dp,int m1,int m2, int m3){
    super(nm,roll,dp);
    mark1=m1;
    mark2=m2;
    mark3=m3;
  }
  public void calculate(){
    total=mark1+mark2+mark3;
    avg=total/3;
    if(mark1>40&&mark2>40&&mark3>40){
      res="Pass";
    }
    else{
      res="Fail";
    }
  }
  public void disp2(){
    System.out.println("Mark 1:"+ mark1);
    System.out.println("Mark 2:"+ mark2);
    System.out.println("Mark 3:"+ mark3);
    System.out.println("Total:"+ total);
    System.out.println("Average"+ avg);
    System.out.println("Result:"+ res);
}
}
class details{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Name:");
   String no=sc.next();
   System.out.println("Enter Register No:");
   int reg=sc.nextInt();
   System.out.println("Enter Department:");
   String dep=sc.next();
   System.out.println("Enter Three Subjects Marks:");
   int mark1=sc.nextInt();
   int mark2=sc.nextInt();
   int mark3=sc.nextInt();
   mark s1=new mark(no,reg,dep,mark1,mark2,mark3);
   s1.disp1();
   s1.calculate();
   s1.disp2();
}
}
    
    
   