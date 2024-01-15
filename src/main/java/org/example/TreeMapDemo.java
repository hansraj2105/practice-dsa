package org.example;

public class TreeMapDemo{
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMapDemo=new TreeMap();
        treeMapDemo.put("c",1);
        treeMapDemo.put("b",2);
        treeMapDemo.put("d",3);
        treeMapDemo.put("z",4);
        treeMapDemo.put("p",4);
        treeMapDemo.put("q",4);
        treeMapDemo.put("s",4);
        treeMapDemo.put("t",4);
        treeMapDemo.put("n",4);

        treeMapDemo.print();


    }
}

 class TreeMap<K extends Comparable<K>,V> {
    private Node<K,V> root;

    public void put(K key,V val){

        if(root==null){
            root=new Node<>();
            root.setKey(key);
            root.setValue(val);
        }else {
            Node<K, V> newNode = new Node<>();
            newNode.setKey(key);
            newNode.setValue(val);
            root= insert(root,newNode);
        }
    }
    private Node<K,V> insert(Node<K,V> root,Node<K,V> newNode){
        if(root==null){
            return newNode;
        }
        if(root.getKey().compareTo(newNode.getKey())==0){
            root.setValue(newNode.getValue());
            return root;
        }else if (root.getKey().compareTo(newNode.getKey())>0){
            Node<K, V> insert = insert(root.getLeft(), newNode);
            root.setLeft(insert);
        }else {
            Node<K, V> insert = insert(root.getRight(), newNode);
            root.setRight(insert);
        }
        return root;
    }

    public void print(){
        print(root);
    }
    public void print(Node<K,V> root ){
     if(root==null){
         return;
     }
     print(root.getLeft());
        System.out.println(root.getKey()+ "->"+root.getValue());
        print(root.getRight());
    }
 }


class Node<K extends Comparable<K>,V>{
    private K key;
    private V value;
    private Node<K,V> left;
    private Node<K,V> right;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K, V> getLeft() {
        return left;
    }

    public void setLeft(Node<K, V> left) {
        this.left = left;
    }

    public Node<K, V> getRight() {
        return right;
    }

    public void setRight(Node<K, V> right) {
        this.right = right;
    }
}