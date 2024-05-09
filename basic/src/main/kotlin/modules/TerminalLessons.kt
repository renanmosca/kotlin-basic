package org.example.modules

/**
 * Class to understand how user terminal and readLines and user data
 *
 */
class TerminalLessons {

    // Neste exemplo eu peço para o usuário digitar seu nome e logo em seguida seu sobre nome
    // Logo após eu mostro o seu nome e sobrenome
    fun example() {
        println("Este é um código para exemplificar como usar o software para pegar valores inseridos pelo usuário")
        println("--------------------------------------------------------------------------------------------------")

        print("Digite seu primeiro nome: ")
        val primeiroNome = readLine() ?: ""
        print("Digite seu sobrenome: ")
        val sobrenome = readLine() ?: ""

        val nomeCompleto = "$primeiroNome $sobrenome"
        println("Seu nome completo é: $nomeCompleto")
    }


    // Faça um código que solicita ao usuário para escrever um número
    // Depois peça para o usuário escrever outro número
    // Depois mostre a soma dos dois números
    fun firstLesson() { }

    // Faça um código que solicita ao usuário para escrever um número
    // Depois peça para o usuário escrever outro número
    // Depois mostre qual número é o maior
    fun secondLesson() {}

    // Faça um código que solicite o usuário para escrever seu nome
    // Depois peça para o usuário escrever sua idade
    // Depois mostre seu nome e sua idade
    fun thirdLesson() {}
}