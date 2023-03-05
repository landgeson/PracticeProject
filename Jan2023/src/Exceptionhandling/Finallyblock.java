package Exceptionhandling;

import java.util.Scanner;

public class Finallyblock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
			try {
			String n=sc.next();{
				
			System.out.println(n);
			}
		}catch(Exception e) {
			
			System.out.println(e);
		}finally {
			
			sc.close();
		}
		

	}

}
