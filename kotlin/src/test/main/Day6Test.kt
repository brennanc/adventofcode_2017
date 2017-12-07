package main

import kotlin.test.assertEquals
import org.junit.Test as test

internal class Day6Test {
    private val input = AoCInputFileIO.readFileAsString("day6")
    private val day6 = Day6()

    @test fun day6a() {
        assertEquals(5, day6.rebalanceBanksUntilRepeated("0\t2\t7\t0"))
    }
    @test fun day6b() {
    }
}