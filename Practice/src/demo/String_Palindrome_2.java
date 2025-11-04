package demo;

public class String_Palindrome_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "YOUOY";
String r = "";
for(int i=0;i<s.length();i++) {
	r = s.charAt(i) + r;
}
System.out.println(r);
if(s.equals(r)) {
	System.out.println("String is Palindrome");
}
else
	System.out.println("String is not a palindrome");
	}

}
