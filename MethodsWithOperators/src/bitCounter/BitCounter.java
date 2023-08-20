package bitCounter;

import java.util.Scanner;

public class BitCounter {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the integer");
	int n=scan.nextInt();
	BitwiseBitCounter b=new BitwiseBitCounter();
	int res=b.countSetBits(n);
	System.out.println("Number of set bits: "+res);
}
}
