package Day2.ReExercise;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please input:");
			String str = input.nextLine();
			if (str.toLowerCase().equals("exit"))
				break;

			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}
}
