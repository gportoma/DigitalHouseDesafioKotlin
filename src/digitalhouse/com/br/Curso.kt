package digitalhouse.com.br

class Curso(
    val nome: String,
    val codigoCurso: Int,
    val qntdMaxAlunos: Int,

    ) {

//    val professorTitular = ProfessorTitular
//    val professorAdjunto = ProfessorAdjunto

    val listaAlunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return listaAlunosMatriculados.size < qntdMaxAlunos
    }

    fun excluirAluno(umAluno: Aluno) {

        if (listaAlunosMatriculados.contains(umAluno)) {
            listaAlunosMatriculados.remove(umAluno)
        } else {
            println("Aluno Inexistente")
        }
    }

}