import java.util.Scanner;

public class Holiday{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		if(str.equals("Saturday")||str.equals("Sunday")) {
			System.out.println("yes");
		}
		else 
			System.out.println("no");
	}
	
}
