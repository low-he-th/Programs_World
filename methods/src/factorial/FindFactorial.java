package factorial;

public class FindFactorial {
public static int  logic(int num) {
	int factorial=1;
	for (int i=1;i<=num;i++) {
		factorial*=i;
	}
	return factorial;
}
}
