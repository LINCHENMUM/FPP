package FPPPretest;

import java.util.*;

public class Main {
	public static void main(String[] args) {
				
		Item i1=new Item("Lin", "10", new Date(2016, 12, 24));
		Item i2=new Item("Lin", "10", new Date(2016, 12, 24));
		Item i3=new Item("Lin2", "16", new Date(2016, 12, 24));
		Item i4=new Item("Lin6", "19", new Date(2016, 12, 29));
		Item i5=new Item("Lin4", "14", new Date(2016, 12, 26));
        System.out.println("i1 compare i2 by equals() ="+i1.equals(i2));
        System.out.println("i1 compare i2 by ItemComparator ="+new ItemComparator().compare(i1, i2));
		System.out.println("i1 compare i3 ="+i1.equals(i3));
		System.out.println("i1 compare i3 by ItemComparator ="+new ItemComparator().compare(i1, i3));
		
		ArrayList<Item> item = new ArrayList<Item>();
		item.add(i1);
		item.add(i2);
		item.add(i3);
		item.add(i4);
		item.add(i5);
		
		// Iterator iterator=item.iterator();
		// while(iterator.hasNext()){
		// System.out.println(iterator.next());
		// }
		Collections.sort(item, new InameComparator());
		// for (Item a : item) {
		// System.out.println(a);
		// }

		Iterator iterator = item.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("");
		Collections.sort(item,new IpriceComparator());
		for (Item item2:item){
			System.out.println(item2);
		}
		System.out.println("");
		Collections.sort(item, new ItemComparator());
		for (Item item3:item){
			System.out.println(item3);
		}
		
		System.out.println("TreeSet..............");
//		TreeSet<Item> tset=new TreeSet<Item>(new ItemComparator());
		TreeSet<Item> tset=new TreeSet<Item>(new InameComparator());
		tset.add(i1);
		tset.add(i2);
		tset.add(i3);
		tset.add(i4);
		tset.add(i5);
//		Iterator iteratorset=tset.iterator();
//		while(iteratorset.hasNext()){
//			System.out.println(iteratorset.next());
//		}
		for (Item item4:tset){
			System.out.println(item4);
		}
		
		System.out.println("LinkedList..............");
		List<Item> linkItem=new LinkedList<Item>();
		linkItem.add(i1);
		linkItem.add(i2);
		linkItem.add(i3);
		linkItem.add(i4);
		linkItem.add(i5);
		for (Item itemLink:linkItem){
			System.out.println(itemLink);
		}
		
	}
}
