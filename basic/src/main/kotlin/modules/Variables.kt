package org.example.modules

/**
 * Esta classe foi criada para mostrar como utilizar variáveis em kotlin
 *
 */
class Variables {
    fun variables() {
        // As variáveis servem para guardar informações
        // Você pode guardar: textos e números, por exemplo.

        // Vou mostrar os tipos de variáveis

        // String -> serve para guardar texto
        var texto = "isso é um texto"
        println("A variável texto contém o texto: $texto")

        // Int -> serve para guardar numeros inteiros:
        var numero = 12
        println("A variável numero contém o numero: $numero")

        // Double -> Serve para guardar números com vírgule
        var numeroComVirgule = 12.2
        println("A variável numeroComVirgule contém o numero: $numeroComVirgule")

        // Boolean -> serve para guardar o valor TRUE ou FALSE
        var verdadeiro = true
        println("A variável verdadeiro contém o valor: $verdadeiro")
        var falso = false
        println("A variável falso contém o valor: $falso")
    }
}