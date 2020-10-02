package runtimepractice;

import java.util.HashMap;

public class RunTimePractice {

    public static int findNumberOfRepetitions(String s, char c) {
        // O(n)
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum ++;
            }
        }
        return sum;
    }

    public static int[] findNumberOfRepetitionsv1(String s, char [] c) {
        // O(n*m)
        int[] sums = new int[c.length]; // 1
        for (int i = 0; i < s.length(); i++) { // 1, n+1, n
            for (int j = 0; j < c.length; j++) { // n, n*m + 1, n*m
                if (s.charAt(i) == c[j]) { // n*m
                    sums[j] = sums[j] + 1; // n*m
                }
            }
        }
        return sums; // 1
    }

    public static int[] findNumberOfRepetitionsv2(String s, char[] c) {
        // Optimal time: O(n)
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }
        for (int j = 0; j < c.length; j++) {
            int sum;
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        findNumberOfRepetitions("abca", 'a');
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration);

        char[] a = {'a', 'b'};
        String s = "abcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhtyiujsrtyrhzdfgae4"
                    +"q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhtyiujsrtyr"
                    +"hzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhty"
                    +"iujsrtyrhzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerf"
                    +"egdfhtyiujsrtyrhzdfgae4q3wtaehjfgjsfgjsrthhe4q3wtaehjfgjsfgjsrthhabcaasdfwerawera"
                    +"q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhtyiujsrtyr"
                    +"hzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhty"
                    +"iujsrtyrhzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerf"
                    +"egdfhtyiujsrtyrhzdfgae4q3wtaehjfgjsfgjsrthhe4q3wtaehjfgjsfgjsrthhabcaasdfwerawera"
                    +"q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhtyiujsrtyr"
                    +"hzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhty"
                    +"iujsrtyrhzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerf"
                    +"q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhtyiujsrtyr"
                    +"hzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhty"
                    +"iujsrtyrhzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerf"
                    +"q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhtyiujsrtyr"
                    +"hzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhty"
                    +"iujsrtyrhzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerf"
                    +"q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhtyiujsrtyr"
                    +"hzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerfegdfhty"
                    +"iujsrtyrhzdfgae4q3wtaehjfgjsfgjsrthhabcaasdfwerawera wefasdfasdfasdfaefwfaerwerf";

        startTime = System.currentTimeMillis();
        findNumberOfRepetitionsv1(s, a);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration);

        startTime = System.currentTimeMillis();
        findNumberOfRepetitionsv2(s, a);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration);
    }
}
