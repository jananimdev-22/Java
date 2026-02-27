class zerodivisionerror{
  public static void main(String[] args){
    try{
      int a=10,b,c;
      c=a/0;
    }
    catch(ArithmeticException e){
      System.out.println("Cant divide by zero");
    }
  }
}
      