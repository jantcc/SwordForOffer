package Problem10;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		System.out.println("������һ������:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Problem10 p = new  Problem10();
		int count = p.getnumber(num);

		System.out.println("��������������1�ĸ���Ϊ:"+count);

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
