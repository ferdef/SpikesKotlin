import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
	return a + b    
}

fun sum_two_numbers(): Int {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    return solveMeFirst(num1, num2)
}

fun main(args: Array<String>) {
  println(sum_two_numbers())
}
