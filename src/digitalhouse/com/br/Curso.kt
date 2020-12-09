package digitalhouse.com.br

class Curso(
    val nome: String,
    val codigoCurso: Int,
    val qntdMaxAlunos: Int,
    var professorTitular: ProfessorTitular? = null,
    var professorAdjunto: ProfessorAdjunto? = null

) {
    val listaAlunosMatriculados = mutableListOf<Aluno>()
    override fun toString(): String {
        return "Curso: $nome Quantidade Máxima de Alunos: $qntdMaxAlunos Professor Titular: ${professorTitular?.nome} ${professorTitular?.sobrenome} Professor Adjunto: ${professorAdjunto?.nome} ${professorAdjunto?.sobrenome} Alunos Matriculados: ${listaAlunosMatriculados.size}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }

    override fun hashCode(): Int {
        return codigoCurso
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaAlunosMatriculados.size < qntdMaxAlunos) {
            listaAlunosMatriculados.add(umAluno)
            return true
        } else {
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {

        if (listaAlunosMatriculados.contains(umAluno)) {
            listaAlunosMatriculados.remove(umAluno)
            println("Aluno ${umAluno.nome} ${umAluno.sobrenome} Removido")
        } else {
            println("Aluno Inexistente")
        }
    }


}