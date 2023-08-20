package bitCounter;

public class BitwiseBitCounter {
int countSetBits(int n)
{
	int count=0;
	while(n!=0) {
		count=count+(n&1);
		n=n>>1;
	}
	return count;
}
}




//to calculate bits 0 then use ternary operator
//count=count+(n&1)==0?1:0;