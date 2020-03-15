import java.lang.*;
public class MakeString {


public static void main(String args[]){

char c[]={'a','j','a','v','a','b','c','d','e'};
String s=new String(c,1,4);


String s1=new String(s);

System.out.println(s);
System.out.println(s1);


}


}