package liu;

import java.util.Scanner;

public class Abc {
	private static Scanner scan;

	public static void main(String[] args) {
	  scan = new Scanner(System.in);
	  String read = scan.nextLine();
	  String[] abc = read.split(" ");
	  int num = 0;
	  for(int i = 0; i < abc.length; i++){
		  num += Integer.valueOf(abc[i]);
	  }
	  System.out.println(num);
	}
}
