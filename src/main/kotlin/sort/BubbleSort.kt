package sort

fun bubbleSort(source: Array<Int>) : Array<Int> {
    var i = 1
    while (i < source.size) {
        var j = 0
        while (j < source.size - i) {
            val current = source[j]
            val next = source[j + 1]
            if (current > next) {
                source[j] = next
                source[j + 1] = current
            }
            j++
        }
        i++
    }
   return source
}