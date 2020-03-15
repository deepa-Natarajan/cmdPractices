class AdditionalString{
public static void main(String args[]){

float x=1234.4f;
String s=String.valueOf(x);
System.out.println(s);

int num[]={1,2,3,4,5};//only char array can be represented other will //cryptic
String n=String.valueOf(num);
System.out.println(n);


char c[]={'a','b','c'};
String ch=String.valueOf(c);
System.out.println(ch);

String m1="DeepA";System.out.println(m1);
String m2=m1.toUpperCase();System.out.println(m2);
String m3=m1.toLowerCase();System.out.println(m3);

String result=String.join("||",s,n,m1,m2,m3);System.out.println(result);

}
}