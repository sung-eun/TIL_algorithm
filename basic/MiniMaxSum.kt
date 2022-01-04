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

fun miniMaxSum(arr: Array<Int>): Unit {
    arr.sort()
    
    var min: Long = 0L
    var max: Long = 0L
    
    arr.forEachIndexed { i, n ->
        if (i == 0) {
            min += n
        } else if (i == 4) {
            max += n
        } else {
            min += n
            max += n
        }
    }
    
    println("$min $max")
}
