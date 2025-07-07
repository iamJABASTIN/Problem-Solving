
public class Main1 {
    public static void main(String[] args) {
        LL list = new LL();
        // list.insertFirst(10);
        // list.insertFirst(15);
        // list.insertFirst(20);
        // list.insertFirst(25);
        // list.insertFirst(30);
        // list.insertLast(35);
        // list.insertLast(40);
        // list.insertLast(45);
        // list.insertLast(50);
        list.display();
        list.displayLast();
        list.displayFirst();
        System.out.println("Size: "+list.getSize());
        System.out.println("Is Linked List is empty? : "+list.isEmpty());
    }
}
