package demo;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String org = "Mom";
String revers = "";
for(int i =org.length()-1;i>=0;i--) {
	
	revers =  revers + org.charAt(i);
}
if(org.toLowerCase().equals(revers.toLowerCase())) {
	System.out.println("String is Palindrome");
}
else
	System.out.println("String is not a Palindrome");

System.out.println("Original String:- "+org);
System.out.println("Reversed String:- "+revers);
	}

}
