package tram.dev;

import java.util.Scanner;

public class Project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        n = sc.nextInt();
        if( n > 0)
        {
        	if (soNguyenTo(n)==1)
        		System.out.println(n+ " La so nguyen to ");
        	else
        		System.out.println(n+ " Khong phai la so nguyen to ");
        }
	}
	public static int soNguyenTo(int n) {
		int dem = 0;
		for(int i = 1; i <= n; i++)
		{
			if(n%i == 0)
				dem++;
		}
		if (dem == 2)
				return 1;
		else return 0;
	}

}
