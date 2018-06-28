fun fibo(position : Int) : Long = when(position) {
	in 0..1 -> 1
	else -> fibo(position-1) + fibo(position-2)
}

fun main(args: Array<String>) {
	var number = 35
	println("$number ${fibo(number)}")
}
