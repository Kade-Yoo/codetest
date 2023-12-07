package leetcode

/**
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 *
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 *
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
 *
 * 34/40 또... Time Limit Exceeded
 * 간단하게 해결할 수 있는 방안이 있을 듯..
 */
class GasStation {

    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        // gas 합 < cost 합 이면 return -1
        if (gas.sum() < cost.sum()) {
            return -1
        }

        val size = gas.size
        for (order in gas.indices) {
            // gas[i] - cost[i] > 0
            var sum = gas[order]
            for (index in gas.indices) {
                val realIndex = index + order
                val circularIndex = realIndex % size
                if (sum - cost[circularIndex] < 0) {
                    sum = -1
                    break
                }

                // gas[i] - cost[i] + gas[i]
                sum = sum - cost[circularIndex] + gas[(realIndex + 1) % size]
            }

            if (sum > 0) {
                return order
            }
        }

        return -1
    }
}