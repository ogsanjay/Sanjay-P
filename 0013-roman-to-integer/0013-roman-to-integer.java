class Solution {
  public static int romanToInt(String s) {
        int sum = 0;
        char previous = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char roman = s.charAt(i);

            switch (roman) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    if (previous == 'I')
                        sum += 3;
                    else
                        sum += 5;
                    break;
                case 'X':
                    if (previous == 'I')
                        sum += 8;
                    else
                        sum += 10;
                    break;
                case 'L':
                    if (previous == 'X')
                        sum += 30;
                    else
                        sum += 50;
                    break;
                case 'C':
                    if (previous == 'X')
                        sum += 80;
                    else
                        sum += 100;
                    break;
                case 'D':
                    if (previous == 'C')
                        sum += 300;
                    else
                        sum += 500;
                    break;
                case 'M':
                    if (previous == 'C')
                        sum += 800;
                    else
                        sum += 1000;
                    break;
            }
            previous = roman;
        }
        return sum;
    }

}