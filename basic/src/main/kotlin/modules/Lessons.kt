package org.example.modules

import org.example.models.Question

/**
 * Esta classe serve para escrever problemas e soluciona-los
 */
class Lessons {
    fun lesson() {
        println("---------------------------------------")
        println("Descrição da pergunta:")
        println("André tinha 127 figurinhas e Paulo, 58. Quantas figurinhas tinham os dois juntos?")

        val andre: Int = 130
        val paulo: Int = 20
        val resultado: Int = andre + paulo
        println("Os dois juntos tinham $resultado figurinhas")

    }

}