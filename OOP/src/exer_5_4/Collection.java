package exer_5_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		
		// ArrayList
		System.out.println("ArrayList: ");
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// add to ArrayList
		arrayList.add("Cupcake");
		arrayList.add("Donut");
		arrayList.add("Eclair");
		arrayList.add("Froyo");
		arrayList.add("Giner-bread");
		arrayList.add("HoneyComb");
		arrayList.add("Ice Cream Sandwich");
		arrayList.add("Jelly Bean");
		arrayList.add("KitKat");
		
		// add to location 4
		arrayList.add(4,"Lollipop");
		
		// print array list
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		
		// remove the last element
		System.out.println("");
		if(!arrayList.isEmpty()){
			arrayList.remove(arrayList.size() - 1);
		}
		
		// print array list
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println("");
		
		
		// HashMap
		System.out.println("Hash Map: ");
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		//add to Hash Map
		hashMap.put(1, new String("Cupcake"));
		hashMap.put(2, new String("Donut"));
		hashMap.put(3, new String("Eclair"));
		hashMap.put(10, new String("Froyo"));
		hashMap.put(5, new String("Giner-bread"));
		hashMap.put(6, new String("HoneyComb"));
		hashMap.put(7, new String("Ice Cream Sandwich"));
		hashMap.put(8, new String("Jelly Bean"));
		hashMap.put(9, new String("KitKat"));
		
		//add to location 4
		hashMap.put(4, new String("Lollipop"));
				
		// print 
		for (Integer i : hashMap.keySet()) {
			System.out.println(i + "	" + hashMap.get(i));
		}
		
		// remove the last element
		hashMap.remove(10);
		for (Integer i : hashMap.keySet()) {
			System.out.println(i + "	" + hashMap.get(i));
		}
	}

}
