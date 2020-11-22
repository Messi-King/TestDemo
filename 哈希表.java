import java.util.Objects;

class Person {
    int id;
    public Person(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
class HashBuck<K,V> {
    static class Node<K,V> {
        public K data;//key  map.put(key,val);
        public V value;
        public Node<K,V> next;

        public Node(K data, V value) {
            this.data = data;
            this.value = value;
        }
    }

    public Node<K,V>[] array;
    public int usedSize;

    public HashBuck() {
        this.array = new Node[10];
        this.usedSize = 0;
    }

    /**
     * Object:
     *   hashCode
     *   equals
     *  为什么需要重写？
     *  1、hashCode：找到位置
     *  2、equals 比较key是否相同
     * @param key
     * @param value
     */
    public void put(K key,V value) {

        int hash =  key.hashCode();//找位置
        int index = hash % this.array.length;//合法的下标

        for(Node<K,V> cur = array[index]; cur != null; cur = cur.next) {
            if(cur.data .equals(key) ) {
                cur.value = value;
                return;
            }
        }
        Node<K,V> node = new Node<K,V>(key,value);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
    }

    public V getValue(K key) {
        int hash = key.hashCode();
        int index = hash%array.length;
        for (Node<K,V>cur = array[index]; cur != null; cur = cur.next) {
            if(cur.data .equals(key)) {
                return cur.value;
            }
        }
        return null;
    }
}