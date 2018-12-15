class Solution {
    public int romanToInt(String s) {
        int len = s.length(), value = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean left = i > 0;
            switch (s.charAt(i)) {
                case 'I':
                    value++;
                    break;
                case 'V':
                    if (left && s.charAt(i - 1) == 'I') {
                        value += 3;
                    } else {
                        value += 5;
                    }
                    break;
                case 'X':
                    if (left && s.charAt(i - 1) == 'I') {
                        value += 8;
                    } else {
                        value += 10;
                    }
                    break;
                case 'L':
                    if (left && s.charAt(i - 1) == 'X') {
                        value += 30;
                    } else {
                        value += 50;
                    }
                    break;
                case 'C':
                    if (left && s.charAt(i - 1) == 'X') {
                        value += 80;
                    } else {
                        value += 100;
                    }
                    break;
                case 'D':
                    if (left && s.charAt(i - 1) == 'C') {
                        value += 300;
                    } else {
                        value += 500;
                    }
                    break;
                case 'M':
                    if (left && s.charAt(i - 1) == 'C') {
                        value += 800;
                    } else {
                        value += 1000;
                    }
                    break;
            }
        }
        return value;
    }
}
