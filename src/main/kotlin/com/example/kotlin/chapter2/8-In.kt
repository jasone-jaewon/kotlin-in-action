package com.example.kotlin.chapter2

// in 과 range표현을 사용하여 boolean 식 표현도 가능
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

// in 앞에 !를 붙여 부정을 표현
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "DIGIT"
    in 'a'..'z', in 'A'..'Z' -> "LETTER"
    else -> throw IllegalArgumentException("only digit and letter")
}