package linkedList;

public class queue {


public static void main(String [] args){

}
        linkedListMain list = new linkedListMain();

        public void enQueue(Object data) {
            list.addLast(data);
        }

        public void deQueue() {
            list.deleteFirst();
        }

        public void display() {
            list.display();
        }


}
