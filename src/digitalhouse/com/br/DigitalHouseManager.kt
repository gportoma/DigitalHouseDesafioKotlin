package digitalhouse.com.br

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class DigitalHouseManager() {

    val listaDeAlunos = mutableListOf<Aluno>()
    val listaDeProfessores = mutableListOf<Professor>()
    val listaDeCursos = mutableListOf<Curso>()
    val listaDeMatricula = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int, qntdMaxAlunos: Int) {
        val curso = Curso(nome, codigoCurso, qntdMaxAlunos)
        listaDeCursos.add(curso)
        println("Curso $nome Registrado com sucesso")
    }

    fun excluirCurso(codigoCurso: Int) {
        try {
            for (c in listaDeCursos) {
                if (c.codigoCurso == codigoCurso) {
                    listaDeCursos.remove(c)
                    println("Curso ${c.nome} removido")
                }
            }
        } catch (e: ConcurrentModificationException) {
            e.stackTrace

        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, qntdHoras: Int) {
        val professorAdjunto = ProfessorAdjunto(nome, sobrenome, tempoCasa = 0, codigoProfessor, qntdHoras)
        listaDeProfessores.add(professorAdjunto)
        println("Professor Adjunto $nome $sobrenome Registrado com sucesso")
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val professorTitular = ProfessorTitular(nome, sobrenome, tempoCasa = 0, codigoProfessor, especialidade)
        listaDeProfessores.add(professorTitular)
        println("Professor Titular $nome $sobrenome Registrado com sucesso")
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (p in listaDeProfessores) {
            if (p.codigoProfessor == codigoProfessor) {
                listaDeCursos.remove(p)
                println("Professor ${p.nome} ${p.sobrenome} removido")
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAlunos.add(aluno)
    }


    fun matricularAlunoCurso(codigoAluno: Int, codigoCurso: Int) {
        var curso: Curso? = null
        var aluno: Aluno? = null

        for (c in listaDeCursos) {
            if (c.codigoCurso == codigoCurso) {
                curso = c
            }
        }
        for (a in listaDeAlunos) {
            if (a.codigoAluno == codigoAluno) {
                aluno = a
            }
        }
        if (curso?.codigoCurso == codigoCurso && aluno?.codigoAluno == codigoAluno) {
            if (curso.adicionarUmAluno(aluno)) {
                val matricula = Matricula(aluno, curso, date = LocalDate.now())
                listaDeMatricula.add(matricula)
                println(
                    "Matricula do(a) ${aluno.nome} ${aluno.sobrenome} Realizada no curso ${curso.nome} no dia ${
                        matricula.date.format(
                            DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                        )
                    }"
                )
            } else {
                println("Não há vagas disponíveis no Curso ${curso.nome}")
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        var professorTitular: ProfessorTitular? = null
        var professorAdjunto: ProfessorAdjunto? = null
        var curso: Curso? = null

        for (prof in listaDeProfessores) {
            if (prof.codigoProfessor == codigoProfessorTitular && prof is ProfessorTitular) {
                professorTitular = prof
            } else if (prof.codigoProfessor == codigoProfessorAdjunto && prof is ProfessorAdjunto) {
                professorAdjunto = prof
            }
        }
        for (c in listaDeCursos) {
            if (c.codigoCurso == codigoCurso) {
                curso = c
            }
        }
        if (curso?.codigoCurso == codigoCurso && professorTitular?.codigoProfessor == codigoProfessorTitular && professorAdjunto?.codigoProfessor == codigoProfessorAdjunto) {
            curso.professorTitular = professorTitular
            println("Professor Titular ${professorTitular.nome} ${professorTitular.sobrenome} alocado no Curso ${curso.nome}")
            curso.professorAdjunto = professorAdjunto
            println("Professor Adjunto ${professorAdjunto.nome} ${professorAdjunto.sobrenome} alocado no Curso ${curso.nome}")
        }
    }
}