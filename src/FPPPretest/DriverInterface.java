package FPPPretest;

import java.util.ArrayList;
import java.util.Iterator;

public class DriverInterface {
public static void main(String[] args){
	
	UpwardHatInterface upwardHat=new UpwardHatInterface();
	upwardHat.getFigure();
	DownwardHatInterface downwardHat=new DownwardHatInterface();
	downwardHat.getFigure();
	FaceMakerInterface facemaker=new FaceMakerInterface();
	facemaker.getFigure();
	VerticalInterface Vertical=new VerticalInterface();
	Vertical.getFigure();
	
	System.out.println("");
	ArrayList list=new ArrayList();
	list.add(upwardHat);
	list.add(downwardHat);
	list.add(facemaker);
	list.add(Vertical);
	Iterator iterator=list.iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next().getClass().getDeclaredMethods());
	}
	
	
}
}
