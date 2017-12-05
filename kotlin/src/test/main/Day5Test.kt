package main

import kotlin.test.assertEquals
import org.junit.Test as test

internal class Day5Test {
    private val inputs = AoCInputFileIO.readFileAsStrings("day5")
    private val day5 = Day5()

    @test fun day5a() {
        assertEquals(5, day5.jumps(listOf("0", "3", "0", "1", "-3")))
        println(day5.jumps(inputs))
    }
    @test fun day5b() {
        assertEquals(10, day5.jumpsWithWrinkle(listOf("0", "3", "0", "1", "-3")))
        println(day5.jumpsWithWrinkle(inputs))
    }
}