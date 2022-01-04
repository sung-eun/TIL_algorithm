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

fun lonelyinteger(a: Array<Int>): Int {
    val map = HashMap<Int, Int>()
    a.forEach {
        val count: Int = map[it] ?: 0
        map[it] = count + 1
    }
    
    map.forEach { entry ->
        if (entry.value == 1) {
            return entry.key
        }
    }
    
    return -1
}
