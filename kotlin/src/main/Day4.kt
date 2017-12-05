package main

import java.util.*
import java.util.regex.Pattern
import java.util.stream.Collectors
import java.util.stream.IntStream
import java.util.stream.Stream


class Day4 {
    fun noDuplicateWordPassphrase(s: String): Boolean {
        return (s.split(" ").none { it -> Collections.frequency(s.split(" "), it) > 1 })
    }

    fun numValidPassphrases(inputs: List<String>): Int {
        return inputs.map { noDuplicateWordPassphrase(it) }
                .filter{ it }.size
    }

    fun getAnagrams(str : String) : List<String> {
        str.asIterable()
        return listOf("")
    }
}