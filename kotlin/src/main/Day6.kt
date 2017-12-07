package main

class Day6 {
    fun rebalanceBanksUntilRepeated(input: String): Int {
        val bankVals = input.split("\t")
        var banks = RingBuffer<Int>(bankVals.size)
        bankVals.forEach { banks.add(it.toInt()) }
        val maxInfo : Pair<Int?, Int> = banks.maxValue()

        return 5
    }

    /*
    fun bankWithMostBlocks(rb : RingBuffer<Int>) : Pair {
        var largestIdx = 0
        val max : Pair<Int?, Int> = rb.maxValue()
        return max.first!!
    }
    */
}