package FPPPretest;

import java.util.Comparator;

public class InameComparator implements Comparator<Item> {

public int compare(Item ob1, Item ob2){
	return ob1.iname.compareTo(ob2.iname);
}
}
