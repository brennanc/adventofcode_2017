package main

import java.util.*


class Day4 {
    fun noDuplicateWordPassphrase(s: String): Boolean {
        return (s.split(" ").none { it -> Collections.frequency(s.split(" "), it) > 1 })
    }

    fun numValidPassphrases(inputs: List<String>): Int {
        return inputs.map { noDuplicateWordPassphrase(it) }
                .filter{ it }.size
    }

    fun noDuplicateAnagramsPassphrase(s: String): Boolean {
        if (!noDuplicateWordPassphrase(s))
            return false

        val strs = s.split(" ")
        val out = strs.map { strs.map { ys -> Pair(it, ys) } }
                .flatten()
                .filter { it.first != it.second }
                .none { permutation_func("", it.second).contains(it.first) }
        return out

    }

    fun countValidPassphrases(inputs : List<String>) : Int {
        var count = 0
        for (input in inputs) {
            if (noDuplicateAnagramsPassphrase(input)) count++
        }
        return count
    }

    fun permutation_func(prefix: String, str: String) : Set<String> {
        val n = str.length
        var anagrams = mutableSetOf<String>()
        if (n == 0) {
            return setOf(prefix)
        }
        else {
            for (i in 0 until n)
                anagrams.addAll(permutation_func(prefix + str[i], str.substring(0, i) + str.substring(i + 1, n)))
        }
        return anagrams
    }
}