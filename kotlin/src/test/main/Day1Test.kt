package main

import kotlin.test.assertEquals
import org.junit.Test as test

internal class Day1Test {
    private val input = AoCInputFileIO.readFileAsString("day1")
    private val day1 = Day1()

    @test fun day1a() {
        assertEquals(day1.captchaSum("1122"), 3)
        assertEquals(day1.captchaSum("1111"), 4)
        assertEquals(day1.captchaSum("1234"), 0)
        assertEquals(day1.captchaSum("91212129"), 9)
        println(day1.captchaSum(input))
    }

    @test fun day1b() {
        assertEquals(day1.captchaSumHalf("1212"), 6)
        assertEquals(day1.captchaSumHalf("1221"), 0)
        assertEquals(day1.captchaSumHalf("123425"), 4)
        assertEquals(day1.captchaSumHalf("123123"), 12)
        assertEquals(day1.captchaSumHalf("12131415"), 4)
        println(day1.captchaSumHalf(input))
    }
}