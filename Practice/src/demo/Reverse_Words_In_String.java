package demo;

public class Reverse_Words_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "the sky is blue";
String [] str=s.split(" ");
int end =str.length;

for(int i=end-1;i>=0;i--) {
	

System.out.print(str[i]+" ");
	}
	}
}
