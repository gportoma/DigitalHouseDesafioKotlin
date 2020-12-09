package digitalhouse.com.br

fun main() {
    val dh = DigitalHouseManager()

    println("\n##################### Registrar Dois professores (Titular e Adjunto) #####################\n")

    dh.registrarProfessorTitular("Jose", "Eduardo", 1, "Kotlin")
    dh.registrarProfessorAdjunto("Fernando", "Souza", 2, 10)

    println("\n##################### Registrar Dois Cursos #####################\n")

    dh.registrarCurso("Full Stack", 20001, 3)
    dh.registrarCurso("Android", 20002, 2)

    dh.matricularAluno("Guilherme", "Porto", 10)
    dh.matricularAluno("Gabriela", "sousa", 20)

    println("\n##################### Alocar um Professor Titular um Adjunto #####################\n")

    dh.alocarProfessores(20001, 1, 3)

    println("\n##################### Matricular Dois alunos no Curso de Full Stack #####################\n")

    dh.matricularAlunoCurso(10, 20001)
    dh.matricularAlunoCurso(20, 20001)

    println("\n##################### Excluir um Aluno #####################\n")
    dh.listaDeCursos[0].excluirAluno(dh.listaDeAlunos[0])

    println("\n##################### Excluir um Professor #####################\n")
    dh.excluirProfessor(2)

    println("\n##################### Excluir um Curso #####################\n")
    dh.excluirCurso(20002)

}