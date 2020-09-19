package binarysearchtree;

public class NonEmptyBST<E extends Comparable> implements Tree<E> {

    E data;
    Tree<E> left;
    Tree<E> right;

    public NonEmptyBST(E elt) {
        data = elt;
        left = new EmptyBST<E>();
        right = new EmptyBST<E>();
    }

    public NonEmptyBST(E elt, Tree<E> leftTree, Tree<E> rightTree) {
        data = elt;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality(); // recursion
    }

    @Override
    public boolean member(E elt) {
        if (data == elt) {
            return true;
        } else {
            if (elt.compareTo(data) < 0) {
                return left.member(elt);
            } else {
                return right.member(elt);
            }
        }
    }

    @Override
    public NonEmptyBST<E> add(E elt) {
        if (data == elt) {
            return this;
        } else {
            if (elt.compareTo(data) < 0) {
                return new NonEmptyBST(data, left.add(elt), right);
            } else {
                return new NonEmptyBST(data, left, right.add(elt));
            }
        }
    }
}
