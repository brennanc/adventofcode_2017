package main

import kotlin.test.assertEquals
import org.junit.Test as test

internal class Day4Test {
    private val inputs = AoCInputFileIO.readFileAsStrings("day4")
    private val day4 = Day4()

    @test fun day4a() {
        assertEquals(true, day4.noDuplicateWordPassphrase("aa bb cc dd ee"))
        assertEquals(false, day4.noDuplicateWordPassphrase("aa bb cc dd aa"))
        assertEquals(true, day4.noDuplicateWordPassphrase("aa bb cc dd aaa"))
        println(day4.numValidPassphrases(inputs))
    }
}