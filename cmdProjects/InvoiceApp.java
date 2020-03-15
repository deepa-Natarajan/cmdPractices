import java.util.Scanner;
public class InvoiceApp{

private double subTotal,invoiceAmount;
//static final double DISCOUNT_PERCENT= 0.2;

public static void main(String[] args){
System.out.println("Welcome to the Invoice Total Calculator !!");

String choice="y";
while(choice.equalsIgnoreCase("y")){

	InvoiceApp ia=new InvoiceApp();

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Subtotal:");

	double subTotal=sc.nextDouble();
	double discount=ia.getDiscountPercent(subTotal);

	double total=ia.calculateInvoiceTotal(subTotal,discount);
	ia.show(total,discount);

System.out.println("Continue:y/n:");
 choice=sc.next();


}
System.out.println("Thank you!!!");
}

public double calculateInvoiceTotal(double subTotal,double discount){
return subTotal-(subTotal * discount);
}

public void show(double total,double discount){
String message="Discount Percent : " + discount +"\n"+
"Invoice Amount:"  + total;
System.out.println(message);

 
}
public double getDiscountPercent(double subTotal){
double sub=subTotal;
double discountPercent;
if (sub >=200){discountPercent= .2;} 
else if (sub >=100){discountPercent=.1;}
else {discountPercent=0.0;}
return discountPercent;



}


}