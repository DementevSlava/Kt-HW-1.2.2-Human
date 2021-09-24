package ru.netology

fun main() {

    val likes = 1256321

    if (likes % 10 == 0 || likes % 100 == 11 || likes % 100 == 12 || likes % 100 == 13 || likes % 100 == 14
        || likes % 100 == 15 || likes % 100 == 16 || likes % 100 == 17 || likes % 100 == 18 || likes % 100 == 19
        || likes % 10 == 5 || likes % 10 == 6 || likes % 10 == 7 || likes % 10 == 8 || likes % 10 == 9 ) {
        println("Храниться $likes лайков")
    } else if (likes % 10 == 1) {
        println("Храниться $likes лайк")
    } else if (likes % 10 == 2 || likes % 10 == 3 || likes % 10 == 4 || likes % 10 == 5) {
        println("Храниться $likes лайка")
    } else {
        println("Error")
    }
}

