class SetCharDemo{
public static void main(String args[]){
StringBuffer sb= new StringBuffer("Hello");
System.out.println(sb);
System.out.println(sb.length());//to find length
System.out.println(sb.capacity());//to find the capacity


System.out.println(sb.charAt(1));//find the characters using index
sb.setCharAt(1,'i');
sb.setLength(2);//set length...increase or decrease the size of the characters.

System.out.println(sb);

System.out.println(sb.length());//to find length
System.out.println(sb.capacity());//to find the capacity

//sb.setLength(10);
sb.append("I am Learning Java!");
System.out.println(sb);
System.out.println(sb.length());//to find length
System.out.println(sb.capacity());//to find the capacity
}

}