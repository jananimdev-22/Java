class StringBufferExample {
  public static void main(String[] args){
    StringBuffer sb = new StringBuffer("Hello");
    System.out.println(sb.append("World"));
    StringBuffer sb1 = new StringBuffer("Java is fun");
    System.out.println(sb1.replace(5, 7, "was"));
    StringBuffer sb2 = new StringBuffer("Hello World");
    System.out.println(sb2.delete(5, 11));
    System.out.println(sb.reverse());
    System.out.println(sb2.capacity());
  }
}