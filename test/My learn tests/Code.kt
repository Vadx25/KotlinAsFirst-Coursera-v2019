package `My learn tests`

import lesson1.task1.sqr

// Kotlin
fun example() {
    for(i in 1..10) {
        println(i)
    }

    for(line in "a,b,c".split(",")) {
        println(line)
    }
}

fun main(args: Array<String>) {
    //val x1x2 = quadraticRootProduct(1.0, 13.0, 42.0)
    //println("Root product: $x1x2")
    if (args.size == 0) return

    print("Первый аргумент: ${args[0]}")
}