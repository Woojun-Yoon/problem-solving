class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = -1;
        int right = 1;
        String mainHand = hand.equals("left") ? "L" : "R";
        
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                right = num;
            } else {
                int leftMove = 0;
                int rightMove = 0;
                int leftCheck = left;
                int rightCheck = right;
                if (left == -1 || left == 1 || left == 4 || left == 7) {
                    leftMove++;
                    leftCheck = left + 1;
                }
                if (right == 1 || right == 3 || right == 6 || right == 9) {
                    rightMove++;
                    rightCheck = right - 1;
                }
                leftMove += calMidMove(leftCheck, num);
                rightMove += calMidMove(rightCheck, num);
                if (leftMove == rightMove) {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = num;
                    } else {
                        sb.append("R");
                        right = num;
                    }
                } else {
                    if (leftMove < rightMove) {
                        sb.append("L");
                        left = num;
                    } else {
                        sb.append("R");
                        right = num;
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private int calMidMove(int before, int after) {
        if (before == 2) {
            if (after == 2) {
                return 0;
            } else if (after == 5) {
                return 1;
            } else if (after == 8) {
                return 2;
            } else {
                return 3;
            }
        } else if (before == 5) {
            if (after == 5) {
                return 0;
            } else if (after == 0) {
                return 2;
            } else {
                return 1;
            }
        } else if (before == 8) {
            if (after == 8) {
                return 0;
            } else if (after == 2) {
                return 2;
            } else {
                return 1;
            }
        } else {
            if (after == 0) {
                return 0;
            } else if (after == 8) {
                return 1;
            } else if (after == 5) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}