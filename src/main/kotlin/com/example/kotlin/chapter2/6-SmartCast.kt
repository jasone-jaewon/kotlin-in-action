package com.example.kotlin.chapter2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Int, val right: Int) : Expr

/**
 * smart cast
 *
 * 따로 캐스팅 하지 않아도 is 로 검사하였으니 원하는 타입으로 선언된 것 처럼 사용 가능
 * 실제로는 컴파일러가 캐스팅을 수행해준다.
 *
 * smart cast는 타입 검사후, 해당 값이 바뀔 수 없는 경우에만 동작
 * - 반드시 val로 선언되어야 하며 커스텀 접근자도 사용 불가
 */
fun evalV1(e: Expr): Int {
    if (e is Num) {
        val n = e as Num // <- 불필요한 중복
        return n.value;
    }
    if (e is Sum) {
        // 조건문에서 Sum인 걸 알았으니 바로 프로퍼티(left, right)에 접근 가능
        return e.left + e.right
    }
    throw IllegalArgumentException("Unkown expression")
}

fun evalV2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        e.left + e.right
    } else {
        throw IllegalArgumentException("Unkown expression")
    }


fun evalV3(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> e.left + e.right
        else -> throw IllegalArgumentException("Unkown expression")
    }