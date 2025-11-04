package demo;

public class Number_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 121;
int revers=0;
while(num!=0) {
	revers = revers*10 + num%10;
	num=num/10;
}
System.out.println(revers);
	}

}
