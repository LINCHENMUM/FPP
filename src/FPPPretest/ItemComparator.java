package FPPPretest;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {
	public int compare(Item ob1, Item ob2) {
		int nameCompare = ob1.iname.compareTo(ob2.iname);
		if (nameCompare == 0) {
			int priceCompare = ob1.iprice.compareTo(ob2.iprice);
			if (priceCompare == 0) {
				int dateCompare = ob1.pdate.compareTo(ob2.pdate);
				return dateCompare;
			} else {
				return priceCompare;
			}
		} else {
			return nameCompare;
		}
	}
}
