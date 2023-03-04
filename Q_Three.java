public
class Q_Three {
    public boolean equal(CircularlyLinkedList l){
        Node<E> x = tial.Next;
        Node<E> y = l.tial.Next;
        boolean count = false;
        while (x != tial && y !=l.tial){
            if (x.element != y.element)
                return false;
            x = x.Next;
            y = y.Next;
        }
        if (x == tial && y == l.tial)
        return true;
        else
            return false;
    }
}
