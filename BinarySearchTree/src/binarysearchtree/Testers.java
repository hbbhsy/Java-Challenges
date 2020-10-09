package binarysearchtree;

import java.util.Random;

public class Testers  {

    // random integers
    public static int rndInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    // random binary search trees
    public static Tree rndTree(int count) {
        if (count == 0) {
            return new EmptyBST();
        } else {
            return rndTree(count - 1).add(rndInt(0, 50));
        }
    }


    public static void checkIsEmpty(Tree t) throws Exception {
        // if the tree t is an instance of EmptyBST --> isEmpty --> true
        // if the tree is an instance of NonEmptyBST --> t.isEmpty --> false
        if (t instanceof EmptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("All is not good, the tree is an EmptyBST and it's not empty");
            }
        } else if (t instanceof NonEmptyBST) {
                if (!t.isEmpty()) {
                    throw new Exception("All is not good, the tree is an NonEmptyBST and it's empty.");
                }
            }
        }

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        int nT = (t.add(x)).cardinality();
        if (nT == (t.cardinality() + 1)) {
            if (t.member(x)) {
                throw new Exception("The cardinality increased by 1., but the thing"
                                    + " that was added was already a member of the tree.");
            } else {
                System.out.println("Good");
            }
        } else if (nT == t.cardinality()) {
            throw new Exception("Something is wrong with our program.");
        } else {
            System.out.println("Good.");
        }

    }

}
