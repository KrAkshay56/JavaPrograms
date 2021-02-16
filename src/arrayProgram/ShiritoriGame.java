package arrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class ShiritoriGame {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the string");
		list.add(scan.next());
		for(int i=0;i<list.size();) {
			System.out.println("enter the string");
			list.add(scan.next());
			if(list.get(i).charAt(list.get(i).length()-1)==list.get(i+1).charAt(0)) {
				System.out.println("valid");
				i++;
			}
			else
			{
				System.out.println("game over");
				break;
			}
		}
		scan.close();
	}
	
	
	

}
