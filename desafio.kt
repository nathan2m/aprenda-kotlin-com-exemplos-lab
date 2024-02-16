enum class Nivel { INICIAL, MEDIO, AVANCADO }

data class Aluno(val nome: String)

data class ConteudoEducacional(val nome: String)


class Formacao(val nome: String, val nivel: Nivel) {
    
    val conteudosAdicionados = mutableListOf<ConteudoEducacional>()
    val alunosMatriculados = mutableListOf<Aluno>()
    
    fun adicionar(vararg conteudos: ConteudoEducacional) {
        for(conteudo in conteudos){
            conteudosAdicionados.add(conteudo)
        	println("Conteúdo: '${conteudo.nome}' foi adicionado na formação: '$nome'")
        }
    }
    
    fun matricular(vararg alunos: Aluno) {
        for(aluno in alunos) {
           	alunosMatriculados.add(aluno)
        	println("Aluno: '${aluno.nome}' foi matriculado na formação: '$nome'") 
        } 
    }
    
    fun printRelatorio() {
        println("----------")
        println("Formação: '$nome'")
        println("Nível: '$nivel'")
        println("----------")
        if (conteudosAdicionados.size > 0){
            println("Conteúdos adicionados:")
            for (conteudo in conteudosAdicionados) {
                println("'${conteudo.nome}'")
            }
        } else {
            println("Não há conteúdos adicionados")
        }
        println("----------")
        if (alunosMatriculados.size > 0) {
            println("Alunos matriculados:")
            for (aluno in alunosMatriculados) {
                println("'${aluno.nome}'")
            }
        } else {
            println("Não há alunos matriculados")
        }
        println("----------")
    }
}

fun main() {
    val formacao1 = Formacao("Aprendendo Kotlin", Nivel.INICIAL)
    
    val conteudo1 = ConteudoEducacional("Olá Mundo")
    val conteudo2 = ConteudoEducacional("Funções")
    
    formacao1.adicionar(conteudo1, conteudo2)
    
    val aluno1 = Aluno("Nathan")
    val aluno2 = Aluno("Manera")
    
    formacao1.matricular(aluno1, aluno2)
    
   	formacao1.printRelatorio()
}
