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

fun plusMinus(arr: Array<Int>): Unit {
    var positiveCount: Double = 0.0
    var negativeCount: Double = 0.0
    var zeroCount: Double = 0.0
    
    arr.forEach {
        if (it > 0) {
            positiveCount++
        } else if (it < 0) {
            negativeCount++
        } else {
            zeroCount++
        }
    }
    
    val n = arr.size
    println(String.format("%.6f", positiveCount / n))
    println(String.format("%.6f", negativeCount / n))
    println(String.format("%.6f", zeroCount / n))
}
