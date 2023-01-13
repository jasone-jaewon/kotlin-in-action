package com.example.kotlin.chapter2

/**
 * value object - 코드가 없이 데이터만 저장하는 클래스
 * kotlin은 기본 접근자가 public 이므로 생략 가능
 *
 */
class Person(val name: String)


class PersonV2(
    val name: String, // 읽기 전용 프로퍼티. getter 만 존재
    var isMarried: Boolean // 쓸 수 있는 프로퍼티. setter, getter 존재
)

fun classV1() {
    val personV2 = PersonV2("kotlin in action", false)

    println(personV2.name)       // getter
    println(personV2.isMarried)  // getter

    personV2.isMarried = true    // setter
    // personV2.name = "java in action" <- error
}

/**
 * 커스텀 접근자
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
    // get() = height == width 도 가능
}
fun classV2() {
    val rectangle = Rectangle(100, 200)
    println(rectangle.isSquare)
}