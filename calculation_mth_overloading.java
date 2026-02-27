class calculation_mth_overloading {
    int add(int a,int b){
      return a+b;
    }
    int add(int a,int b,int c){
      return a+b+c;
    }
    int add(int a,int b,int c,int d){
      return a+b+c+d;
    }
    double add(double a, double b){
      return a+b;
    }
    public static void main(String[] args){
      calculation_mth_overloading abc = new calculation_mth_overloading();
      int a = abc.add(2,5);
      System.out.println(a);
      int b = abc.add(2,3,4);
      System.out.println(b);
      int c = abc.add(1,2,2,0);
      System.out.println(c);
    }
}