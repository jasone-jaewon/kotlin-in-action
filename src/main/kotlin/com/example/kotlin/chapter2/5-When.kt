package com.example.kotlin.chapter2

enum class ColorV1 {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

enum class ColorV2(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun whenTest(color1: ColorV2, color2: ColorV2) {
    /**
     * switch 와 다르게 break 생략 가능
     */
    val mnemonic = when (color1) {
        ColorV2.RED -> "Richard"
        ColorV2.ORANGE -> "Of"
        ColorV2.YELLOW -> "York"
        ColorV2.GREEN -> "Gave"
        ColorV2.BLUE -> "Battle"
    }

    /**
     * 콤마(,)로 구분 가능
     */
    val warmth = when (color1) {
        ColorV2.RED, ColorV2.ORANGE, ColorV2.YELLOW -> "warm"
        ColorV2.GREEN -> "neutral"
        ColorV2.BLUE -> "cold"
    }

    /**
     * 분기 조건에 객체 사용 가능
     */
    val mixedColor = when (setOf(color1, color2)) {
        setOf(ColorV2.RED, ColorV2.YELLOW) -> ColorV2.ORANGE
        setOf(ColorV2.YELLOW, ColorV2.BLUE) -> ColorV2.GREEN
        else -> throw RuntimeException("Dirty Color")
    }

    /**
     * 인자 없는 when
     */
    val mixedColor2 = when {
        (color1 == ColorV2.RED && color2 == ColorV2.YELLOW) ||
        (color1 == ColorV2.YELLOW && color2 == ColorV2.RED) -> ColorV2.ORANGE

        (color1 == ColorV2.YELLOW && color2 == ColorV2.BLUE) ||
        (color1 == ColorV2.BLUE && color2 == ColorV2.YELLOW) -> ColorV2.GREEN

        else -> throw RuntimeException("Dirty Color")
    }
}