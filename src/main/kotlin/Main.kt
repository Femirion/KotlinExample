import sort.bubbleSort
import kotlin.random.Random

fun main(args: Array<String>) {
    var array = Array(10) { Random.nextInt(0, 100) }
    println("before= " + array.joinToString(" "))
    println("after= " + bubbleSort(array).joinToString(" "))
}