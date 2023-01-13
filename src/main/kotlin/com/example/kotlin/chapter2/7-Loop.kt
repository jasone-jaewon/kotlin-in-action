package com.example.kotlin.chapter2

/**
 * 반복문
 *
 * - while은 자바와 동일
 * - for
 * range를 사용 (..)
 */

fun loopTest() {
    // 1 과 100을 포함
    for (i in 1..100) {
        println(fizzBuzz(i))
    }

    // 100부터 2씩 감소
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }

    // 0부터 99 까지. 반만 닫힌 loop
    // 0 in 99 = 0 until 100
    for (i in 0 until 100) {
        println(fizzBuzz(i))
    }

    // map loop - 구조분해
    val alphabetMap = mapOf(Pair(1, "A"), Pair(2, "B"), Pair(3, "C"))
    for ((number, alphabet) in alphabetMap) {
        println("$number,$alphabet")
    }

    // list loop - 구조분해
    val alphabetList = arrayListOf("A", "B", "C")
    for ((index, alphabet) in alphabetList.withIndex()) {
        println("$index,$alphabet")
    }
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}
