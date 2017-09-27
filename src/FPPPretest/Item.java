package FPPPretest;

import java.util.*;

public class Item {
	 String iname;
	 String iprice;
	 Date pdate; // Purchase date 
	 public Item(String iname,String iprice,Date pdate){
		 this.iname=iname;
		 this.iprice=iprice;
		 this.pdate=pdate;
	 }
	 public boolean equals(Object ob){
		 if(ob==null) return false;
		 if(ob==this) return true;
		 if (!(ob instanceof Item)) return false;
		 Item object=(Item)ob;
		 boolean isEqual=(object.iname.equals(this.iname))&&
				         (object.iprice.equals(this.iprice))&&
				         (object.pdate.equals(this.pdate));
		 return isEqual;
	 }
	 public int hashCode(){
		 int result=17;
		 int hiname=this.iname.hashCode();
		 int hiprice=this.iprice.hashCode();
		 int hpdate=this.pdate.hashCode();
		 result+=result*31+hiname;
		 result+=result*31+hiprice;
		 result+=result*31+hpdate;
		 return result;
	 }
	 public String toString(){
		 return "Item[iname="+iname+" iprice="+iprice+" pdate="+pdate+"]";
	 }
}
