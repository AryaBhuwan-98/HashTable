package com.bridgelabz.hashtable;

public class MyMapNode<V, K> {
	K key;
    V value;
    MyMapNode<K, V> next1;
	private Object next2;
	private Object next3;
	private Object next4;

    // constructor name as MyMaoNode and passing key and value
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next1 = null;
    }

   // method getter and setter
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;

    }
    //  getvalue method and setvalue
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode<K, V> getNext() {
        return next1;
    }

    public void setNext(MyMapNode<K, V> next) {
        this.next1 = (MyMapNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyMapNode{" + " Key= ").append(key).append(" Value= ").append(value).append('}');
        Object next;
		if (next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}