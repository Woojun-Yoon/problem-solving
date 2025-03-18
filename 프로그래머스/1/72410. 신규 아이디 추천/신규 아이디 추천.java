class Solution {
    public String solution(String new_id) {
        String one = new_id.toLowerCase();
        System.out.println("one:" + one);
        
        String two = one.replaceAll("[~!@#$%^&*()=+\\[\\]{}:?,<>/]", "");
        System.out.println("two:" + two);
        
        String three = two.replaceAll("\\.{2,}", ".");
        System.out.println("three:" + three);
        
        String four = three;
        if (four.length() > 0) {
            if (four.charAt(0) == '.') {
                four = four.substring(1);
            }
        }
        if (four.length() > 0) {
            if (four.charAt(four.length() - 1) == '.') {
                four = four.substring(0, four.length() - 1);
            }
        }
        System.out.println("four:" + four);
        
        String five = four;
        if (five.length() == 0) {
            five = five + "a";
        }
        System.out.println("five:" + five);
        
        String six = five;
        if (six.length() >= 16) {
            six = six.substring(0, 15);
            if (six.charAt(14) == '.') {
                six = six.substring(0, 14);
            }
        }
        System.out.println("six:" + six);
        
        String seven = six;
        if (seven.length() <= 2) {
            char add = seven.charAt(seven.length() - 1);
            while (true) {
                if (seven.length() >= 3) {
                    break;
                }
                seven = seven + add;
            }
        }
        System.out.println("seven:" + seven);
        
        return seven;
    }
}