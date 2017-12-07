package main

import kotlin.test.assertEquals
import org.junit.Test as test

internal class Day7Test {
    private val inputs = AoCInputFileIO.readFileAsStrings("day7")
    private val day7 = Day7()

    @test fun day7a() {
        val sampleInput = listOf("pbga (66)", "xhth (57)", "ebii (61)", "havc (66)", "ktlj (57)",
                "fwft (72) -> ktlj, cntj, xhth", "qoyq (66)", "padx (45) -> pbga, havc, qoyq",
                "tknk (41) -> ugml, padx, fwft", "jptl (61)", "ugml (68) -> gyxo, ebii, jptl",
                "gyxo (61)", "cntj (57)")
        assertEquals("tknk", day7.findBottom(sampleInput))
        println(day7.findBottom(inputs))
    }
    @test fun day7b() {
    }
}