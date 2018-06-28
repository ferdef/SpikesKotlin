import java.io.*
import java.util.*

fun get_values(): Pair<String, String> {
    val first_line = readLine()!!
	val second_line = readLine()!!

    return Pair(first_line, second_line)
} 

fun mode_a(): Pair<Int, Int> {
    val (first_line, second_line) = get_values()
	val array_first = first_line.split(' ')
   	val array_second = second_line.split(' ')
	var alice = 0
    var bob = 0
	for (counter in (0..2)) {
        if (array_first[counter].toInt() > array_second[counter].toInt()) {
            alice += 1
        }
        if (array_first[counter].toInt() < array_second[counter].toInt()) {
            bob += 1
        }
	}

    return Pair(alice, bob)
}

fun mode_b(): Pair <Int, Int> {
    val (first_line, second_line) = get_values()
    var alice = 0
    var bob = 0
    val array_first = first_line.split(' ')
   	val array_second = second_line.split(' ')
    
    val list = array_first.zip(array_second)
    val (a, b) = list.fold(Pair(0 ,0)) { total, next -> Pair(total[0] + 1, total[1] + 5)}
    println(list)
    return Pair(alice, bob)
}

fun main(args: Array<String>) {
    //var (alice, bob) = mode_a()
	//println("$alice $bob")
    var (alice2, bob2) = mode_b()
    println("$alice2 $bob2")
}