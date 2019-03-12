import java.util.Scanner;
import java.lang.Math;


class Main{
public static void main(String[] args){
	int s , a = 0 , n;
	@SuppressWarnings("resource")
	Scanner k= new Scanner(System.in);
	while(true) {
		s=k.nextInt();
		if(s==(-1))
		break;
		
		for (n=(int) Math.sqrt(s*2); n > 0; n--) {
			if ((2 * s + n - n * n) % (2 * n) == 0) {
				a = (2 * s + n - n * n) / (2 * n);
				break;
			}
		}

		
		System.out.println(s+" = "+a+" + ... + "+(a+n-1));
	}
}
}
