package palindrome;

import java.util.Scanner;

public class Plaindrome {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int num=scan.nextInt();
	int res=method(num);
	if(res==num) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
public static int method(int num) {
	int sum =0;
	while(num>0) {
	int rem=num%10;
	sum=sum*10+rem;
	num=num/10;
}
	return sum;
}
}
