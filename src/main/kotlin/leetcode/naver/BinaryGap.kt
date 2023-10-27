package leetcode.naver

class BinaryGap {

    // you can also use imports, for example:
    // import java.util.*;

    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");

    // you can also use imports, for example:
    // import java.util.*;
    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");
    fun solution(N: Int): Int {
        // Implement your solution here
        var start = N % 2
        var end = 0
        var count = 0
        var maxCount = 0
        var divdedNum = N

        while (!((divdedNum % 2) == 0 && (divdedNum / 2) == 0)) {
            divdedNum /= 2
            end = divdedNum % 2

            if (end == 1) {
                if (maxCount < count) {
                    maxCount = count
                }
                count = 0
                start = end
            }

            if (end == 0 && start == 1) {
                count++
            }
        }
        return maxCount
    }

}