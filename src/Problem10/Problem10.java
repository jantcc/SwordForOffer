package Problem10;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		System.out.println("请输入一个整数:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Problem10 p = new  Problem10();
		int count = p.getnumber(num);

		System.out.println("该数二进制数中1的个数为:"+count);

	}
	public int getnumber(int n){

		int count=0;
		while(n!=0)
		{
			count++;
			n=(n-1) & n;
		}
		return count;
	}
}
