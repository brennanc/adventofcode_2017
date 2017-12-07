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

    @test fun day4b() {
        assertEquals(false, (day4.noDuplicateAnagramsPassphrase("ab cd ab")))
        assertEquals(false, (day4.noDuplicateAnagramsPassphrase("ab cd ba")))
        assertEquals(true, (day4.noDuplicateAnagramsPassphrase("ab cd")))
        assertEquals(false, day4.noDuplicateAnagramsPassphrase("ab ba"))
        assertEquals(true,(day4.noDuplicateAnagramsPassphrase("abcde fghij")))
        assertEquals(false, day4.noDuplicateAnagramsPassphrase("abcde xyz ecdab"))
        assertEquals(true, day4.noDuplicateAnagramsPassphrase("a ab abc abd abf abj"))
        assertEquals(true, day4.noDuplicateAnagramsPassphrase("iiii oiii ooii oooi oooo"))
        assertEquals(false, day4.noDuplicateAnagramsPassphrase("oiii ioii iioi iiio"))
        assertEquals(true, day4.noDuplicateAnagramsPassphrase("ojufqke gpd olzirc jfao cjfh rcivvw pqqpudp"))
        assertEquals(false, day4.noDuplicateAnagramsPassphrase("iix ewj rojvbkk phrij iix zuajnk tadv givslju ewj bda"))
        println(day4.countValidPassphrases(inputs))
    }
}