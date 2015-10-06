package exerciceTree;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by R522 on 25/09/2015.
 */
class bsTree<T> implements Iterable<T>{

    bsTree<T> raiz;
    bsTree<T> left;
    bsTree<T> right;
    Comparable<T> comparable;

    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
