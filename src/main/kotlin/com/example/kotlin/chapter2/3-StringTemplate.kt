package com.example.kotlin.chapter2

fun stringTemplate_3(names : List<String>) {
    val name = "kotlin in action"
    println("book name is $name")
    println("book name is ${names[0]}")
}