package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList <String> strings = new ArrayList <String>();
		//2. Add five Strings to your list
		strings.add("String0");
		strings.add("String1");
		strings.add("String2");
		strings.add("Stringe3");
		strings.add("String4");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : strings) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < strings.size(); i+=2) {
			System.out.println(i);
		}
		//6. Print all the Strings in reverse order.
		for(int i = strings.size() - 1; i>= 0; i--) {
			System.out.println(i);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < strings.size(); i ++) {
			String k = strings.get(i);
			if(k.contains("e")) {
				System.out.println(i);
			}
		}
	}
}
