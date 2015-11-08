package i_introduction._2_Named_Arguments

import util.*
import i_introduction._1_Java_To_Kotlin_Converter.task1

fun todoTask2(): Nothing = TODO(
    """
        Task 2.
        Implement the same logic as in 'task1' again through the library method 'joinToString()'.
        Change values of some of the 'joinToString' arguments.
        Use default and named arguments to improve the readability of the function invocation.
    """,
    documentation = doc2(),
    references = { collection: Collection<Int> -> task1(collection); collection.joinToString() })

fun task2(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("{")
    sb.append(collection.joinToString())
    sb.append("}")
    return sb.toString()
}
