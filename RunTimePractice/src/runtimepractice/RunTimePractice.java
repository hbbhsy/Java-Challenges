package runtimepractice;

public class RunTimePractice {

    public static int findNumberOfRepetitions(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum ++;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        findNumberOfRepetitions("abca", 'a');
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.print("Test " + duration);
    }
}
