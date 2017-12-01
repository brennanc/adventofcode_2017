package main

import java.io.InputStream
import java.util.*

object AoCInputFileIO {
    val INPUT_FILE_ROOT : String = "test/resources/"

    public fun readFileAsString(fname : String) : String {
        val fileStream : InputStream? = javaClass.classLoader.getResourceAsStream(INPUT_FILE_ROOT+fname+".txt")
        var txt : String = ""

        Scanner(fileStream).use {
            txt = if (it.useDelimiter("\\A").hasNext()) it.next() else ""
        }

        return txt
    }

}