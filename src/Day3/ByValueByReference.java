package Day3;

import java.awt.Point;

public class ByValueByReference {

	public void badSwap(int var1,int var2)
	{
		
		int temp=var1;
		var1=var2;
		var2=temp;
	}
	
	public static void tricky(Point arg1,Point arg2)
	{
		arg1.x=100;
		arg1.y=100;
		Point temp=arg1;
		arg1=arg2;
		arg2=temp;
		
	}
	public static void main(String[] args)
	{
		Point pnt1=new Point(0,0);
		Point pnt2=new Point(0,0);
		System.out.println("x="+pnt1.x+"y="+pnt1.y);
		System.out.println("x="+pnt2.x+"y="+pnt2.y);
		System.out.println("");
		tricky(pnt1,pnt2);
		System.out.println("x="+pnt1.x+"y="+pnt1.y);
		System.out.println("x="+pnt2.x+"y="+pnt2.y);
	}	
	
	
}

