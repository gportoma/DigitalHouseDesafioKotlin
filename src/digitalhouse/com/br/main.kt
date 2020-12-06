package digitalhouse.com.br

fun main() {
    val dh = DigitalHouseManager()

    dh.registrarProfessorTitular("Jose", "Eduardo", 1, "Kotlin")
    dh.registrarProfessorTitular("Joao", "Borges", 2, "Java")

    dh.registrarProfessorAdjunto("Fernando", "Souza", 3, 10)
    dh.registrarProfessorAdjunto("Vitor", "Pereira", 4, 10)

    dh.registrarCurso("Full Stack", 20001, 3)
    dh.registrarCurso("Android", 20002, 2)

    dh.matricularAluno("Guilherme", "Porto", 10)
    dh.matricularAluno("Gabriela", "sousa", 20)
    dh.matricularAluno("Pedro", "Andrade", 30)
    dh.matricularAluno("Maria", "Silva", 40)
    dh.matricularAluno("Gustavo", "Fernandez", 50)

    dh.alocarProfessores(20001, 1, 3)
    dh.alocarProfessores(20002,2,4)

    dh.matricularAlunoCurso(10, 20001)
    dh.matricularAlunoCurso(20,20001)

    dh.matricularAlunoCurso(30,20002)
    dh.matricularAlunoCurso(40,20002)
    dh.matricularAlunoCurso(50,20002)
}