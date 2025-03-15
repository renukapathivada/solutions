import java.util.HashSet;

class Solution {
    public int totalNumbers(int[] digits) {
        int[] digitCount = new int[10];
        for (int digit : digits) {
            digitCount[digit]++;
        }

        HashSet<String> distinctNumbers = new HashSet<>();

        for (int lastDigit = 0; lastDigit <= 9; lastDigit++) {
            if (digitCount[lastDigit] == 0 || lastDigit % 2 != 0) {
                continue;
            }
            digitCount[lastDigit]--;

            for (int firstDigit = 1; firstDigit <= 9; firstDigit++) {
                if (digitCount[firstDigit] > 0) {
                    digitCount[firstDigit]--;

                    for (int secondDigit = 0; secondDigit <= 9; secondDigit++) {
                        if (digitCount[secondDigit] > 0) {
                            String number = "" + firstDigit + secondDigit + lastDigit;
                            distinctNumbers.add(number);
                        }
                    }

                    digitCount[firstDigit]++;
                }
            }

            digitCount[lastDigit]++;
        }

        return distinctNumbers.size();
    }
}
©leetcode