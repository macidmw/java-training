package homework1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw1 {
	
	public static boolean isPositive(String s){
		String rex = "^[0-9]*[1-9][0-9]*$";
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(s);
		if (m.find()){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		//indivisible by 7 and include 7
		System.out.println("all about 7");
		for(int i = 1; i<=100; i++){
			if(i%7 == 0 || i%10 == 7){
				System.out.print(i+" "); 
			}
		}
		System.out.println();
		
		//maximum 
		System.out.println("maximum");
		System.out.println("Please enter the 1st number: ");
		String sa = new Scanner(System.in).nextLine();
		System.out.println("Please enter the 2nd number: ");
		String sb = new Scanner(System.in).nextLine();
		System.out.println("Please enter the 3rd number: ");
		String sc = new Scanner(System.in).nextLine();
		
		if(isPositive(sa)&&isPositive(sb)&&isPositive(sc)){
			int a = Integer.parseInt(sa);
			int b = Integer.parseInt(sb);
			int c = Integer.parseInt(sc);
			int max = a > b ? a : b;
			max = max > c ? max : c;
			System.out.println("\r\nThe maximum value is " + max);
		}
		else{
			System.out.println("maximum : input are not  positive integer");
		}
		
		//decbin
		System.out.println("decbin");
		System.out.println("Please enter a positive integer: ");
		String decbin = new Scanner(System.in).nextLine();
		
		
		if (isPositive(decbin)){
			int x = Integer.parseInt(decbin);
			StringBuffer result = new StringBuffer();
			
			for(int y = x; y != 0;){
				String z = String.valueOf(y%2);
				y = y/2;
				result.append(z);
			}
			System.out.println(result.reverse());
		}
		else{
			System.out.println("decbin : input is not a positive integer");
		}
		
		
		
		//square root
		System.out.println("square root");
		System.out.println("Please enter a positive integer: ");
		String square = new Scanner(System.in).nextLine();
		if(isPositive(square)){
			int e = Integer.parseInt(square);
			System.out.println(Math.sqrt(e));
		}
		else{
			System.out.println("square root : input is not a positive integer");
		}
			
		
		
		//divisors
		System.out.println("divisors");
		System.out.println("Please enter a positive integer: ");
		String divisors = new Scanner(System.in).nextLine();
		if(isPositive(divisors)){
			int m = Integer.parseInt(divisors);
			for(int n = 1; n <= m; n++){
				if(m%n == 0){
					System.out.print(n + " ");
				}
			}
		}
		else{
			System.out.println("divisors : input is not a positive integer");
		}
		System.out.println();
		
		//odd or even
		System.out.println("odd or even");
		System.out.println("Please enter a positive integer: ");
		String oe = new Scanner(System.in).nextLine();
		if(isPositive(oe)){
			int j = Integer.parseInt(oe);
			if(j%2 == 0){
				System.out.println(j + " is an odd.");
			}else{
				System.out.println(j + " is an even number.");
			}
		}
		else{
			System.out.println("odd or even : input is not a positive integer");
		}
		
	}
}
