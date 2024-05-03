package variables


/**
 * Essa classe sera utilizada para o estudo de variaveis em kotlin
 * abordando seus tipos, mutabilidade e operações
 */
class Variables {

    // Variáveis servem para guardar informações para serem utilizadas.

    // As Variáveis podem guardar:
    //  - Númmeros inteiros
    //  - Númmeros com vírgula
    //  - Textos e caracteres

    // As variáveis podem ser mutáveis ou imutáveis:
    // VAR -> Mutáveis -> são as variáveis que pode ter seu valor alterado
    // VAL -> Imutáveis -> são as variáveis que não podem ter seu valor alterado

    // Como declarar uma variável

    // Essa variável é um texto e pode ter seu valor alterado.
    // Tente fazer isso: mensagem = "novo texto"
    var mensagem = "Isso é uma mensagem"

    // Essa variável é um número e pode ter seu valor alterado
    // Tente fazer isso: numero = 1
    var numero = 0

    // Essa é uma variável que guarda um texto e não pode ter seu valor mudado
    // tente fazer isso: texto = "novo texto"
    val texto = "isso é um texto"

    print(mensagem)

    private fun test() {
        print("test")
    }
}