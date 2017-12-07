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

    override fun iterator(): Iterator<T> = object: Iterator<T> {
        var idx = 0
        override fun hasNext(): Boolean = idx < elements.size

        override fun next(): T = get(idx++)!!
    }

}