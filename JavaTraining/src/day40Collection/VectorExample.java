package day40Collection;

import java.util.Vector;
public class VectorExample {
	public static void main(String args[]) {
		// Create a vector
		Vector<String> vec = new Vector<String>();//default capacity is 10, its capacity gets increase by 100% of its size
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		// Adding elements using addElement() method of Vector
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		System.out.println("Elements are: " + vec);
		for(String str: vec) {
			System.out.println(str);
		}
	}
}