package construct;
import java.util.Scanner;


public class vari {
public static void main(String[] args) {
	int a;
	char c;
	String s;
	Boolean b;
	long l;
	
Scanner sc=new Scanner(System.in);
System.out.println("enter the details all");

System.out.println("enter the number");
a=sc.nextInt();

System.out.println("enter the char");
c=sc.next().charAt(0);

System.out.println("enter name");
s=sc.next();

System.out.println("enter the true or flse");
b=sc.hasNext();

//System.out.println("enter the mob");
//l=sc.nextLong();

System.out.println(a);
System.out.println(c);
System.out.println(s);
System.out.println(b);
//System.out.println(l);

}}
