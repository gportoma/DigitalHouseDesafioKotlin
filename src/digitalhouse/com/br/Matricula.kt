package digitalhouse.com.br

import java.time.LocalDate

data class Matricula(val aluno: Aluno, val curso: Curso,val date: LocalDate) {
    override fun toString(): String {
        return "Aluno: ${aluno.nome}, Curso: ${curso.nome}, Dia: $date"
    }
}