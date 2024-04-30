package  org.example;
import java.util.Iterator;

public class SimpleLinkedHashSet<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T element) {
        if (!contains(element)) {
            Node<T> newNode = new Node<>(element);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }
    }
     public boolean remove(T element) {
         for (Node<T> current = head; current != null; current = current.next) {
             if (current.data.equals(element)) {
                 size--;
                 Node<T> prev = current.prev;
                 Node<T> next = current.next;
                 if(prev==null){
                     head=next;
                 }else {
                     prev.next=next;
                 }

                 return true;
             }
         }
         return false;
        }

    public boolean contains(T element) {
        for (Node<T> current = head; current != null; current = current.next) {
            if (current.data.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public static void main(String[] args) {
        SimpleLinkedHashSet<Integer> set = new SimpleLinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Duplicate, won't be added
        set.add(4);

        set.remove(2);
        System.out.println("Set size: " + set.size());
        System.out.print("Set elements: ");
        for (int element : set) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Contains 3: " + set.contains(3));
        System.out.println("Contains 5: " + set.contains(5));
    }
}
