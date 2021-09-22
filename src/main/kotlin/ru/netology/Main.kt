package ru.netology

fun main() {

    val likes = 61
    if ( likes % 10 == 1 ) {
        print("Понравилось $likes человеку")
    } else {
        print("Понравилось $likes людям")
    }
}