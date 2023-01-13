package com.example.kotlin.chapter2

/**
 * 식(expression) 과 문(statement)
 * expression은 값을 만들어 내며 다른 expression의 하위 요소로 계산에 참여할 수 있다.
 * statement는 자신을 둘러싸고 있는 가장 안쪽 블록의 최상위 요소로 존재하며 아무런 값을 만들어내지 않음.
 *
 * java - 모든 제어구조가 statement
 * kotlin - loop를 제외한 모든 대부분의 제어 구조가 expression
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/**
 * expression이 본문인 함수
 * 등호(=)를 통해 간편하게 표현
 */
fun maxV2(a: Int, b: Int): Int = if (a > b) a else b

/**
 * expression이 본문인 함수인 경우, 반환타입 생략 가능
 *
 * - 타입 추론(type inference) : compiler가 타입을 분석해 타입을 정해주는 기능
 */
fun maxV3(a: Int, b: Int) = if (a > b) a else b
