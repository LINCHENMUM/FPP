package FPPPretest;

import java.util.Comparator;

public class IpriceComparator implements Comparator<Item>{

public int compare(Item ob1, Item ob2){
	return ob1.iprice.compareTo(ob2.iprice);
}
}
