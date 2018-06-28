import java.util.*
import kotlin.io.*

fun read_lines(): Int {
	val first_line = readLine()!!
	val second_line = readLine()!!
	val size = first_line.split(' ')[0].toInt()
	val array = second_line.split(' ')
	var sum = 0
	for (item in array) {
		sum += item.toInt()
	}
	return sum
}

fun main(args: Array<String>) {
	println(read_lines())
}
