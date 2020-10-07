package binarysearchtree;

public class BinarySearchTree {

    public static void main(String[] args) throws Exception {
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);

    }
}
