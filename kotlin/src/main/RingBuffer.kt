package main


class RingBuffer<T>(val size: Int) : Iterable<T> {
    private var elements = ArrayList<T>(size)
    private var mark = -1

    private var filled: Boolean = false

    fun get(idx : Int) : T? { return elements[idx] }

    fun set(v : T, idx : Int) {
        elements.set(idx, v)
    }

    fun add(v : T) {
        mark = (mark + 1) % size
        elements.add(mark, v)
        filled = filled || mark == size - 1
    }

    fun maxValue() : Pair<T?, Int> {
        var maxVal : T? = null
        var maxIdx = 0
        for (i in elements.indices) {
            if (elements[i] == null)
                break

            if (maxVal == null) {
                maxVal = elements[i]
                maxIdx = i
            } else if (elements[i] as Int > maxVal as Int) {
                maxVal = elements[i]
                maxIdx = i
            }
        }
        val out = Pair(maxVal, maxIdx)
        return out
    }

    override fun iterator(): Iterator<T> = object: Iterator<T> {
        var idx = 0
        override fun hasNext(): Boolean = idx < elements.size

        override fun next(): T = get(idx++)!!
    }

}