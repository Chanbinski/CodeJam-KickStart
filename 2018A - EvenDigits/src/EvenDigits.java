import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class EvenDigits {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new File("EvenDigitsInput.txt"));
		PrintWriter out = new PrintWriter(new File("EvenDigitsOutput.txt"));

		int size = in.nextInt();
		for(int i = 1; i <= size; i++) {
			int n = in.nextInt();
		    out.println("Case #" + i + ": " + returnLeast(increase(n), decrease(n)));
		    System.out.print("Done");
		}
		in.close();
		out.close();
	}
	
	public static int returnLeast(int a, int b) {
		
		if(a < b)
			return a;
		else
			return b;
		
	}
	
	public static int increase(int input) {
		
		int count = 0;
		while(true) {
			if(noOddDigits(input))
				return count;
			else {
				input++;
				count++;
			}
		}
	}

	public static int decrease(int input) {
		
		int count = 0;
		while(true) {
			if(noOddDigits(input))
				return count;
			else {
				input--;
				count++;
			}
		}
	}
	
	public static Boolean noOddDigits(int input) {
		
		int size = Integer.toString(input).length();
		Boolean noOdd = true;
		for(int i = 0; i < size; i++) {
			if(Integer.parseInt(Integer.toString(input).substring(i, i+1)) % 2 != 0) {
				noOdd = false;
			}
		}
		return noOdd;
	}
}
