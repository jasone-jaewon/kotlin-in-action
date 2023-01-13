package com.example.kotlin.chapter2

fun variable() {
    // 변수 선언(초기화)
    val questionV1 = "type 생략"
    val questionV2: String = "type 선언"

    // 변수 선언(초기화 X) - 반드시 type 선언 필요
    val questionV3: String


    /**
     * val 은 변경 불가능(immutable) - value
     * var 은 변경 가능(mutable) - variable
     *
     * - 기본적으로 모든 변수를 val로 선언하고 필요한 경우에 var로 변경
     * - 변경 불가능한 참조와 변경 불가능한 객체를 부수효과가 없는 함수와 조합해 사용하면 코드가 함수형 코드에 가까워 진다.
     */
    val value = 100
    var variable = 100
    // value = 200 <- error
    variable = 200
    println("variable : $variable")

    /**
     * val 참조 자체는 불변일지라도 객체의 내부 값은 변경될 수 있다.
     */
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
}