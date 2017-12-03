package main

import java.util.regex.Pattern
import java.util.stream.IntStream
import java.util.stream.Stream


class Day2 {
    fun checksum(input : List<String>): Int {
        val nums = input.map { it.split("\t") .map { it.toInt() } }

        return nums.map { it.max()!! - it.min()!! }.sum()
    }

    fun checksumAsDivisible(input : List<String>) : Int {
        val nums = input.map { it.split("\t") .map { it.toInt() } }
        return nums.map { findSumOfDivisibleInts(it) }.sum()
    }

    private fun findSumOfDivisibleInts(nums: List<Int>): Int {
        return nums.map { nums.map { ys -> Pair(it, ys) } }
                .flatten()
                .filter { it.first != it.second }
                .first { it.first % it.second == 0 }
                .run { this.first / this.second }
    }
}