package com.example.kotlin.chapter2

import java.io.BufferedReader
import java.lang.NumberFormatException

/**
 * 코틀린에서는 checked Exception과 unchecked Exception을 구별하지 않는다.
 *
 * checked Exception을 반드시 잡아서 처리할 필요는 없다.
 */
// IOException은 checked이나 따로 잡을 필요가 없다.
fun readNumberV1(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumberV2(reader: BufferedReader) {
    // try catch 문도 expression이 될 수 있다/
    val number = try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        // exception 이 발생한 경우, return되어 printlin 이 실행되지 않는다.
        return
    }
    println(number)
}

fun readNumberV3(reader: BufferedReader) {
    val number = try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        // exception이 발생하여도 printlin 실행
        null
    }
    println(number)
}