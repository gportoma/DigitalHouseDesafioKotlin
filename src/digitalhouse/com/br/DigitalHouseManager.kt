package digitalhouse.com.br

class DigitalHouseManager() {

    val listaDeAlunos = listOf<Aluno>()
    val listaDeProfessores = listOf<Professor>()
    val listaDeMatricula = listOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, qntdMaxAlunos: Int) {}

    fun excluirCurso(codigoCurso: Int) {}

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, qntdHoras: Int) {}

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {}

    fun excluirProfessor(codigoProfessor: Int) {}

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {}

    fun matricularAlunoCurso(codigoAluno: Int, codigoCurso: Int) {}

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {}

}