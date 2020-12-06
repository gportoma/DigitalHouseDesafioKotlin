package digitalhouse.com.br

class Curso(
    val nome: String,
    val codigoCurso: Int,
    val qntdMaxAlunos: Int,
    var professorTitular: ProfessorTitular? = null,
    var professorAdjunto: ProfessorAdjunto? = null

) {


    val listaAlunosMatriculados = mutableListOf<Aluno>()

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
        } else {
            println("Aluno Inexistente")
        }
    }

}