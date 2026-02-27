class str_ing{
  public static void main(String[] args){
    String s="Java";
    System.out.println(s.length());
    System.out.println(s.charAt(1));
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    String s1=" java ";
    System.out.println(s.equals(s1));
    System.out.println(s.equalsIgnoreCase(s1));
    String n1="Apple";
    String n2="Banana";
    System.out.println(n1.compareTo(n2));
    String i="programming";
    System.out.println(i.substring(0,7));
    System.out.println(i.substring(3));
    System.out.println(i.substring(0,3));
    System.out.println(s.replace('a','o'));
    System.out.println(s1.trim());
    System.out.println(i.indexOf("gr"));
    String s2="Hello";
    System.out.println(s2.concat(s));
    System.out.println(s2.endsWith("lo"));
    System.out.println(s2.contains("o"));
    System.out.println(s2.endsWith("hi"));
    System.out.println(s2.contains("k"));
  }
}