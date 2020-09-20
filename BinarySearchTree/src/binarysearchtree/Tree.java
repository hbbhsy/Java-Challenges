package binarysearchtree;

// Data Structure:
// Graph & Trees
public interface Tree<E extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(E elt);
    public NonEmptyBST<E> add(E elt);
}
