package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sortmethod {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(15);
		a1.add(76);
		a1.add(900);
		a1.add(-150);
		a1.add(36);
		a1.add(23);
		Collections.sort(a1);
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add("Snehika");
		a2.add("Eshaan");
		a2.add("Eshika");
		a2.add("Sanjay");
		Collections.sort(a2);
		System.out.println(a2);

	}

}
