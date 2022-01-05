fun countingSort(arr: Array<Int>): Array<Int> {
    val map = HashMap<Int, Int>()
    arr.forEach {
        val count = map[it] ?: 0
        map[it] = count + 1
    }

    val result = Array<Int>(100) {0}
    for (i in 0 until 100) {
        result[i] = map[i] ?: 0
    }
    return result
}
