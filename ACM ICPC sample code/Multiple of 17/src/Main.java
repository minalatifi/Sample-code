import java.math.BigInteger;
import java.util.Scanner;


class Main {
	public static void main(String[] args)
	{
		BigInteger number;
		BigInteger r;
		BigInteger h;
		String value;
		
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		while(input.hasNext())
		{
			h= new BigInteger("17");
			value=input.next();
			if(value.equals("0"))
				break;
			number = new BigInteger(value);
			r=number.mod(h);
			if(r.equals(BigInteger.ZERO))
				System.out.println(1);
			else
				System.out.println(0);
				
		}
	}

}
