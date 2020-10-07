package binarysearchtree;

public class Testers {

    public static void checkIsEmpty(Tree t) {
        // if the tree t is an instance of EmptyBST --> isEmpty --> true
        // if the tree is an instance of NonEmptyBST --> t.isEmpty --> false
        if (t instanceof EmptyBST) {
            if (t.isEmpty()) {
                System.out.println("All is good, the tree is an EmptyBST and it's empty.");
            } else if (t instanceof NonEmptyBST) {
                if (!t.isEmpty()) {
                    System.out.println("All is good, the tree is an NonEmptyBST and it's not empty.");
                }
            }
        }
    }

}
