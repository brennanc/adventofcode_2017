package main

import kotlin.test.assertEquals
import org.junit.Test as test

internal class Day2Test {
    private val inputs = AoCInputFileIO.readFileAsStrings("day2")
    private val day2 = Day2()

    @test fun day2a() {
        val sampleInput : List<String> = listOf("5\t1\t9\t5", "7\t5\t3", "2\t4\t6\t8")
        assertEquals(18, day2.checksum(sampleInput))

        println(day2.checksum(inputs))
    }

    @test fun day2b() {
        val sampleInput : List<String> = listOf("5\t9\t2\t8", "9\t4\t7\t3", "3\t8\t6\t5")
        assertEquals(9, day2.checksumAsDivisible(sampleInput))

        println(day2.checksumAsDivisible(inputs))
    }

}