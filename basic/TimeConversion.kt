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

private const val AM = "AM"
private const val PM = "PM"

fun timeConversion(s: String): String {
    val amPm = s.substring(s.length - 2, s.length)
    val hour = s.substring(0, 2).toInt()
    val convertedHour = if (amPm == AM) {
        if (hour == 12) {
            0
        } else {
            hour
        }
    } else {
        if (hour == 12) {
            12
        } else {
            hour + 12
        }
    }
    
    return "${"%02d".format(convertedHour)}${s.substring(2, s.length - 2)}"
}
