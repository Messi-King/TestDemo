class HashBuck {
    static class Node {
        public int data;//key  map.put(key,val);
        public int value;
        public Node next;

        public Node(int data,int value) {
            this.data = data;
            this.value = value;
        }
    }
    public Node[] array;
    public int usedSize;
    public HashBuck() {
        this.array = new Node[10];
        this.usedSize = 0;
    }

    public void put(int key,int value) {
        //位置
        int index = key % this.array.length;
        //遍历这个位置下的链表
        for(Node cur = array[index];cur != null;cur = cur.next) {
            if(cur.data == key) {
                cur.value = value;
                return;
            }
        }
        //该链表当中 没有和当前key值一样的元素  就要头插法
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

        if(loadFactor() > 0.75) {
            resize();
        }
    }
    //计算负载因子
    public float loadFactor() {
        return this.usedSize*1.0f / this.array.length;
    }

    /**
     * 必须重新哈希
     */
    public void resize() {
        Node[] newArray = new Node[2*this.array.length];
        for (int i = 0; i < this.array.length; i++) {
            Node curNext = null;
            for(Node cur = array[i]; cur != null;cur = curNext) {
                curNext = cur.next;
                //array[i] 下标是一个链表
                //cur 头结点
                int index = cur.data % newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        this.array = newArray;
    }

    public int getValue(int key) {
        int index = key%array.length;
        for (Node cur = array[index];cur != null;cur = cur.next) {
            if(cur.data == key) {
                return cur.value;
            }
        }
        return -1;
    }

}

public class TestDemo {
    public static void main(String[] args) {

        HashBuck hashBuck = new HashBuck();
        hashBuck.put(1,1);
        hashBuck.put(21,2);
        hashBuck.put(31,3);
        hashBuck.put(4,4);
        hashBuck.put(5,5);
        hashBuck.put(6,6);
        hashBuck.put(7,7);
        hashBuck.put(8,8);
        System.out.println("dfafdsfafafs");
        /*hashBuck.put(40,40);*/
    }
}
