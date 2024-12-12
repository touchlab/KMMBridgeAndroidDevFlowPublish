package co.touchlab.kmp.devflow.kmplib

import kotlin.random.Random

fun whoAmIm():String {
    val randomInt = Random.nextInt()
    val stringVal = "Kotlin Multiplatform Update $randomInt!!!"
    return stringVal
}

object SomethingElse {
    val arst = "tttok2"

    fun hello() {
        println("Hello from SomethingElse")
    }
}