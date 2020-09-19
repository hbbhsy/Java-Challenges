package binarysearchtree;

public class EmptyBST<E extends Comparable> implements Tree<E>{

    public EmptyBST() {

    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(E elt) {
        return false;
    }

    @Override
    public NonEmptyBST<E> add(E elt) {
        return new NonEmptyBST<E>(elt);
    }
}
