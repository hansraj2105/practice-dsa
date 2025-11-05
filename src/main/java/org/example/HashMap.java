

public class HashMap<KEY, VALUE> {

   private static final int DEFAULT_CAPACITY = 16;
   private Prachi<KEY, VALUE>[] table;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
     HashMap<String, Integer> map = new HashMap<>();
     map.put("One", 1);
     map.put("Two", 2);
     map.put("Three", 3);
     map.put("Four", 4);
     map.put("Five", 5);
     System.out.println(map.toString());  
    }
    public boolean put(KEY key, VALUE value) {
        if(key == null) {
            return false;
        }
       int hashCode= hash(key);
       if(table == null) {
           table = new Prachi[DEFAULT_CAPACITY];
       }
       int index = Math.abs(hashCode) % DEFAULT_CAPACITY;
       if(table[index] == null) {
               Prachi<KEY, VALUE> newNode = new Prachi<>(key, value);
           table[index] = newNode;
       } else {
           Prachi<KEY, VALUE> current = table[index];
           while(true) {
               if(current.key.equals(key)) {
                   current.value = value;
               }
                if(current.next == null) {
                     Prachi<KEY, VALUE> newNode = new Prachi<>(key, value);
                     current.next = newNode;
                     break;
                }
               current = current.next;
            }
        }

        return true;
    }


    private int hash(KEY key) {
       return key.hashCode();
    }

    public boolean clear() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
         for (Prachi<KEY,VALUE> prachi : table) {
            Prachi<KEY, VALUE> ref = prachi;

         while(ref!= null) {
                sb.append(ref.key).append("=").append(ref.value).append(", ");
               ref = ref.next;
            }
        }
    return sb.toString();
    }

    private static class Prachi<KEY, VALUE> {
        KEY key;
        VALUE value;
        Prachi<KEY, VALUE> next;

        Prachi(KEY key, VALUE value) {
            this.key = key;
            this.value = value;
        }
    }

}
