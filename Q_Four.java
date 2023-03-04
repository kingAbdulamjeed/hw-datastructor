import org.w3c.dom.Node;

public class Q_Four {
    public  boolean equalsDff(CircularlyLinkedList c){
        Node<E> one = tial.next;
        Node<E> two = c.tial.next;
        while (two != c.tial){
            if (one.element == two.element)
                break;
            two =two.next;
        }
        while (one.element == two.element && two !=c.tial){

            one = one.next;
            two = two.next;
        }
        if (one.element != two.element)
            return false;

               return true;

    }
}
