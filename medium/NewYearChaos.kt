import kotlin.math.max

class NewYearChaos {
  var count = 0

  for (i in (q.size - 1) downTo 0) {
      val person = q[i]
      val originPerson = i + 1
      val originIndex = person - 1

      if (person == originPerson) continue

      if (person - originPerson > 2) {
          println("Too chaotic")
          return
      }

      for (j in max(0, originIndex - 1) until i) {
          if (q[j] > q[i]) count++
      }
  }
  
  println(count)
}
