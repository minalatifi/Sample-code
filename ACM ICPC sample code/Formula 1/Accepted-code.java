import java.util.Scanner;
import java.util.TreeMap;

class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		TreeMap<String,String> tm = new TreeMap<>();
		int i,n,k;
		String s,sk;
		while(in.hasNext()){
			n=in.nextInt();
			tm.clear();
			for(i=0;i<n;i++){
				s=in.next();
				k=0;
				in.next();
				k+=60000*in.nextInt();
				in.next();
				k+=1000*in.nextInt();
				in.next();
				k+=in.nextInt();
				in.next();
				sk=Integer.toString(k);
				while(sk.length()<7)
					sk="0"+sk;
				tm.put(sk+s.toLowerCase()+""+i,s);}

			i=2;
			for(String car: tm.values()){
				if((i++)%2==0)
					System.out.println("Row "+i/2);
				System.out.println(car);
			}
			System.out.println();
		}
	}
}