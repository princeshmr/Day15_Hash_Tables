package com.hashtables;

public class HashTableImplementation<K,V> {

	Node head;
	Node tail;

	public void add(K key, V value) {
		Node<K, V> myNode = searchNode(key);
		if (myNode == null) {
			myNode = new Node<K, V>(key, value);
			this.append(myNode);
		} else {
			myNode.setValue(value);
		}
	}

	public void append(Node<K, V> myNode) {
		if (this.head == null)
			this.head = myNode;
		if (this.tail == null)
			this.tail = myNode;
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public Node<K, V> searchNode(K data) {
		Node<K, V> currentNode = head;
		int position = 0;
		while (currentNode != null) {
			position++;
			if (currentNode.getKey().equals(data)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	public V get(K word) {
		Node<K, V> myMapNode = searchNode(word);
		if (myMapNode == null) {
			return null;
		} else {
			return myMapNode.getValue();
		}

	}

	@Override
	public String toString() {
		return "MyLinkedListNodes{" + head + "} ";
	}
}
