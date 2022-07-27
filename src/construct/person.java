package construct;

public class person {
public person() {
	// TODO Auto-generated constructor stub
	System.out.println("details of contructor");	
	
}
public person(String name) {
	System.out.println(name);
}
public person(String dob,int month) {
	System.out.println(dob);
	System.out.println(month);

}
public static void main(String[] args) {
	
	person p1=new person();
	person p2=new person("march");
	person p3=new person("99.88.66");
}

}
