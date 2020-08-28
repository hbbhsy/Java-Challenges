package LoopPractice;

public class LoopPractice {

    public static void practiceWhileLoop() {
        int x = 0;
        while(x <5) {
            System.out.println("The value of x is " + x);
            // x = x+1
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while (x <10);
    }

    public static void practiceForLoop() {
        for (int x = 0; x < 3; x++) {
            System.out.println("The value of x is " + x);
//            if (x == 10) {
//                break;
//            }
            for (int y =0; y < 3; y++) {
                System.out.println("("+x+","+y+")");
            }

        }
        System.out.println("This is the end");
    }

    public static void main(String[] args){
        practiceForLoop();

    }


}
