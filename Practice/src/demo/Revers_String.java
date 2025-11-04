package demo;

public class Revers_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="Hello";
		String revers="";
		for(int i = 0; i<org.length();i++){
		revers = org.charAt(i) + revers;
		}
		System.out.println(revers);
	}

}
