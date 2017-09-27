package Day2.ReExercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Prog7 {
	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> set = new HashSet<Integer>();
		while (true) {
			set.add(Math.abs(random.nextInt()) % 99 + 1);
			if (set.size() == 16)
				break;
		}
		Iterator<Integer> it = set.iterator();
		/*for (int i=0;i<20;i++){
			System.out.println(it.next());
		}*/
		String output = "";
		for (int i = 0; i < 2; i++) {
			output += String.format("%16d %12d %12d %12d %n %n", it.next(), it.next(), it.next(), it.next());
			output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n", "+", it.next(), "+", it.next(), "+", it.next(), "+",
					it.next());
			output += String.format("%16s %12s %12s %12s", "____", "____", "____", "____");
			output+=String.format("%n %n %n %n");
		}
		System.out.println(output);
		
		
	}
}
