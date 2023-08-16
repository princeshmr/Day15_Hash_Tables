package com.hashtables;

public class HashTable {

	public static void main(String[] args) {
		System.out.println("Welcome To Hash Table Program");
		HashTableImplementation<String, Integer> hashImpl = new HashTableImplementation<String, Integer>();
		String message = "Paranoids are not	paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";


		String[] messageArray = message.toLowerCase().split(" ");

		for (String word : messageArray) {
			Integer value = hashImpl.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			    hashImpl.add(word, value);
		}
	}

}
