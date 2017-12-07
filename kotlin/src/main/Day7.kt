package main

class Day7 {
    fun findBottom(inputs: List<String>): String {
        val s1 = inputs.filter { it.contains("->") }
        val s2 = s1.map {
            val key = it.split("(")[0].trim()
            val values = it.split(">")[1].replace(" ", "").split(",")
            Pair(key, values)
        }.toMap()
        var result = ""
        s2.forEach {
            var foundYet = false
            s2.forEach { y ->
                if (y.key != it.key) {
                    var tmpResult = ""
                    if (!y.value.contains(it.key) && !foundYet)
                        tmpResult = it.key
                    else {
                        tmpResult = ""
                        foundYet = true
                    }
                }
            }
            if (!foundYet)
                result = it.key
        }
        return result
    }

    /*
    fun bankWithMostBlocks(rb : RingBuffer<Int>) : Pair {
        var largestIdx = 0
        val max : Pair<Int?, Int> = rb.maxValue()
        return max.first!!
    }
    */
}