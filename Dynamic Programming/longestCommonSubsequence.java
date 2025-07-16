package DynamicProgrammimg;

public class LCS {
    public static void longestCommonSubsequence(String s1, String s2) {
        int lenss1 = s1.length() + 1;
        int lenss2 = s2.length() + 1;
        int[][] lcm = new int[lenss1][lenss2];

        for (int i = 0; i < lenss1; i++) {
            lcm[i][0] = 0;
        }
        for (int j = 0; j < lenss2; j++) {
            lcm[0][j] = 0;
        }
        for (int i = 1; i < lenss1; i++) {
            for (int j = 1; j < lenss2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcm[i][j] = lcm[i - 1][j - 1] + 1;
                } else {
                    lcm[i][j] = Math.max(lcm[i][j - 1], lcm[i - 1][j]);
                }

            }

        }
        for (int i = 0; i <lenss1; i++) {
            for (int j = 0; j < lenss2; j++) {
                System.out.print(lcm[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(lcm[lenss1 - 1][lenss2 - 1]);
    }

    public static void main(String[] args) {
        String s1 = "ACADB";
        String s2 = "CBDA";
        longestCommonSubsequence(s1, s2);
    }
}
