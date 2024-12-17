package CollectionPrograms;

import java.util.ArrayList;

public class ArrayGetandSetmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add(15);
a1.add(76);
a1.add(900);
a1.add(-120);
a1.add(65);
a1.add(23);
System.out.println(a1.get(2));
a1.set(0, "ram");
System.out.println(a1);
System.out.println(a1.indexOf(900));
	}

}
