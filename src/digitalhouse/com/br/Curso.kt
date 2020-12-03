package digitalhouse.com.br

class Curso(
    val nome: String,
    val codigoCurso: Int,
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    val qntdMaxAlunos: Int,
    val listaAlunosMatriculados: List<Aluno> = listOf<Aluno>()
) {
    fun adicionarUmAluno(aluno: Aluno): Boolean {
        return true
    }

    fun excluirAluno(aluno: Aluno) {

    }
}