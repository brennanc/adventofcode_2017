package main


class Day1 {
    fun captchaSum(input : String): Int {
        var sum = 0;
        for (i in input.indices) {
            if (i == input.length-1) break
            if (input[i] == input[i + 1]) sum += Character.getNumericValue(input[i])
        }
        if (input[input.length-1] == input[0]) sum += Character.getNumericValue(input[0])

        return sum
    }

    fun captchaSumHalf(input : String) : Int {
        var sum = 0;
        for (i in input.indices) {
            if (input[i] == input[halfwayRoundIndex(i, input.length)]) sum += Character.getNumericValue(input[i])
        }

        return sum
    }

    fun halfwayRoundIndex(curIdx : Int, inputLen : Int) : Int {
        val half = inputLen / 2
        var newIdx = curIdx + half
        if (newIdx > inputLen-1) {
            newIdx = newIdx - inputLen
        }
        return newIdx
    }
}