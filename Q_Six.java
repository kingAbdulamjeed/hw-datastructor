import org.w3c.dom.Node;

public class Q_Six {
public void  clone (CircularlyLinkedList list){
    if (isEmpy ()){
        Node<E> n = tial;
        list.addFirst ( n.element );
        while (n.next != tial){
            n=n.next;
            list.addFirst ( n.element );

        }
    }
  }
}
