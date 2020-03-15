import java.io.*;
class UseTrim
{

public static void main(String[] args) throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;

System.out.println("Enter Stop to quit");
System.out.println("Enter state: ");

do
{
str=br.readLine();
str=str.trim();

if (str.equalsIgnoreCase("Nebraska")) System.out.println("Lincon.");
if (str.equalsIgnoreCase("Kansas"))System.out.println("Topeka");
if (str.equalsIgnoreCase("Iowa"))System.out.println("Des Moines ");
if (str.equalsIgnoreCase("Colorado"))System.out.println("Denvar");


}
while(!str.equalsIgnoreCase("stop"));
}

}