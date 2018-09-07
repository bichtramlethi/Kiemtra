package tram.dev;

import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i<= n; i++) {
        	sum = sum +i;
        }
        System.out.println("Tong la "+sum );

	}

}
