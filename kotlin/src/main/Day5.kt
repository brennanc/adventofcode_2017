package main

import java.util.*
import java.util.regex.Pattern
import java.util.stream.Collectors
import java.util.stream.IntStream
import java.util.stream.Stream


class Day5 {

    fun jumps(inputs : List<String>) : Int {
        var instr = IntArray(inputs.size)
        inputs.forEachIndexed { idx, str -> instr[idx] = str.toInt() }

        var curIdx = 0
        var moveCount = 0
        while (curIdx <= instr.size-1) {
            val tmpIdx = curIdx
            curIdx += instr[curIdx]
            instr[tmpIdx]++
            moveCount++
        }
        return moveCount
    }
    fun jumpsWithWrinkle(inputs : List<String>) : Int {
        var instr = IntArray(inputs.size)
        inputs.forEachIndexed { idx, str -> instr[idx] = str.toInt() }

        var curIdx = 0
        var moveCount = 0
        while (curIdx <= instr.size-1) {
            val tmpIdx = curIdx
            val delta = if (instr[curIdx] >= 3) -1 else 1
            curIdx += instr[curIdx]
            instr[tmpIdx] += delta
            moveCount++
        }
        return moveCount
    }
}