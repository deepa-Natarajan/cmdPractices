//equals VS ==

class EqualsNotEqualsTo{
public static void main(String args[]){

String s1="Hi";
String s2="Hi";
String s3=new String (s1);

System.out.println(s1==s2);//compares two object references to see if they
//refer to the same instance
System.out.println(s1==s3);
System.out.println(s2==s3);
System.out.println(s1.equals(s2));//compares the characters inside the obj
System.out.println(s1.equals(s3));
System.out.println(s2.equals(s3));




}
}