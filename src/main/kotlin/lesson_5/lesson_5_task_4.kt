package org.example.lesson_5

fun main() {
    val userName1: String = "Zaphod"
    val userPassword1: String = "PanGalactic"

    val greeting: String = """
        Ваши данные проверены, и о, чудо, они верны...
        Пользователь "Zaphod", вам разрешено входить
        на борт корабля "Heart of Gold". Хотя мне всё равно...
        Ну вперед, войдите... Если вам так уж надо,
        в конце концов... Надеюсь, вам понравится пребывание
        здесь больше, чем мне.
    """.trimIndent()

    println("Введите имя пользователя")
    val userName: String = readLine()!!
    if (userName != userName1) {
        println("Вы не зарегестрированы, хотите зарегестрироваться?")
    } else {
        println("Введите пароль")
        val passwordInput: String = readLine()!!
        if (userPassword1 == passwordInput) {
            println(greeting)
        }
    }
}
