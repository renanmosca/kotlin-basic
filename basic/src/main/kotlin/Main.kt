package org.example

import org.example.models.Question
import org.example.models.setAnswers
import org.example.modules.Lessons
import org.example.modules.Variables

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val variables = Variables()
    val lessons = Lessons().lesson()
    variables.variables()
    val questionList = mutableListOf<Question>()
    questionList.add(Question("André tinha 127 figurinhas e Paulo, 58. Quantas figurinhas tinham os dois juntos?", 0))
    questionList.add(Question("Rubens tinha algumas figurinhas, ganhou 15 no jogo e ficou com 142. Quantas figurinhas possuia?", 0))
    questionList.add(Question("Num campeonato estudantil, havia 426 atletas inscritos. No último dia, inscreveram-se outros 147. Qual o total de atletas participantes desse campeonato?", 0))
    questionList.add(Question("Alice e Bruno juntaram suas figurinhas num total 238. Como Alice tinha 127 figurinhas, quantas Bruno tinha?", 0))
    questionList.add(Question("Marcelo tinha 83 figurinhas, ganhou algumas e ficou com 109. Quantas figurinhas ele ganhou?", 0))
    questionList.add(Question("Numa escola, há 312 meninos e 217 meninas. Quantos alunos há nessa escola?", 0))
    questionList.add(Question("A equipe Terra fez 125 pontos na primeira rodade de uma gincane da escolae 134 na segunda. Quantos pontos essa equipe fez no total?", 0))
    questionList.add(Question("Numa livraria, havia 7648 livros. Venderam 3854. Quantos livros ficaram?", 0))
    questionList.add(Question("Uma loja tinha 28 automóveis. Vendeu 16 e depois comprou mais 7. Quantos automóveis possui agora?", 0))
    questionList.add(Question("Juliana foi as compras com 70 reais. Gastou 28 reais em uma blusa e 32 reais em uma calça. Quanto dinheiro sobrou?", 0))
    val answerList = mutableListOf(185, 127, 573, 111, 26, 529, 259, 3794, 19, 10)
    val newList = questionList.setAnswers(answerList)
}