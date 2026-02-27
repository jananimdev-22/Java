class skip_mul_of_3 {
  public static void main(String[] args){
    int i;
    for(i=1;i<=10;i++){
      if(i%3==0){
        continue;
      }
      System.out.println(i);
    }
  }
}
    