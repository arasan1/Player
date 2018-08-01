import java.util.Scanner;

public class Nreverse{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str=Integer.toString(a);
		StringBuilder sb=new StringBuilder(str);
		sb=sb.reverse();
		System.out.println(sb);
	}
} 
