package com.company;

public class DecideNumber {

    private static DecideNumber decideNumber;

    private DecideNumber() {

    }

    static{
        decideNumber = new DecideNumber();
    }

    public static DecideNumber getInstance() {
        return decideNumber;
    }

    public int calculateNumber(String number) {
        int ret = -1;
        if (validatePosition(6, number)) {
            // 0, 2, 6, 8
            if (validatePosition(3, number)) {
                // 0, 6, 8
                if (validatePosition(5, number)) {
                    // 0, 8
                    if (validatePosition(4, number)) {
                        // 8
                        ret = 8;
                    } else {
                        // 0
                        ret = 0;
                    }
                } else {
                    // 6
                    ret = 6;
                }
            } else {
                // 2
                ret = 2;
            }
        } else {
            if (validatePosition(3, number)) { // 1, 3, 4, 5, 7, 9
                // 4, 5, 9
                if (validatePosition(5, number)) {
                    // 4, 9
                    if (validatePosition(1, number)) {
                        // 9
                        ret = 9;
                    } else {
                        // 4
                        ret = 4;
                    }
                } else {
                    // 5
                    ret = 5;
                }
            } else {
                // 1, 3, 7
                if (validatePosition(7, number)) {
                    // 3
                    ret = 3;
                } else {
                    // 1, 7
                    if (validatePosition(1, number)) {
                        // 7
                        ret = 7;
                    } else {
                        // 1
                        ret = 1;
                    }
                }
            }
        }

        return ret;
    }

    public boolean validatePosition(int position, String number) {
        return number.charAt(position) != ' ';
    }
}
