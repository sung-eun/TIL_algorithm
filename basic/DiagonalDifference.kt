import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiagonalSum: Int = 0
    var secondaryDiagonalSum: Int = 0
    
    val size = arr.size
    
    for (i in 0 until size) {
        primaryDiagonalSum += arr[i][i]
        
        val j = size - 1 - i
        secondaryDiagonalSum += arr[i][j]
    }

    val difference = primaryDiagonalSum - secondaryDiagonalSum
    return if (difference > 0) difference else -difference
}
