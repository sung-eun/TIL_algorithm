fun minimumSwaps(arr: Array<Int>): Int {
    var count = 0
    for (i in arr.indices) {
        while (arr[i] != i + 1) {
            if (swap(arr, i, arr[i] - 1)) count++
        }
    }
    return count
}

private fun swap(arr: Array<Int>, from: Int, to: Int): Boolean {
    if (from == to) return false
    val temp = arr[from]
    arr[from] = arr[to]
    arr[to] = temp
    return true
}
