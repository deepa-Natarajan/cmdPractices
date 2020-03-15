class Box{
double width, length, height;
Box(double width,double length, double height){
this.width=width;
this.length=length;
this.height=height;

}

public String toString(){

return "Dimensions are " + width +" by "+length+" by "+height +" .";
}


}
public class toStringDemo{



public static void main(String args[]){
String sh="This is a Demo for getChat method.";
int start=0;
int end=13   ;
char ch[]=new char[end-start];

Box b=new Box(12,33,45);
String s= "Box : " + b;

System.out.println(b);// convert Box object to string
System.out.println(s);
System.out.println(b.width);

 sh.getChars(10,end,ch,0);
System.out.println(ch);




}



}