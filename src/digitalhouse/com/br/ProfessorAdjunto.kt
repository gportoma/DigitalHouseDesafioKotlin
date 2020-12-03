package digitalhouse.com.br

class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoCasa: Int,
    codigoProfessor: Int,
    val qntdHoras: Int
) : Professor(nome, sobrenome, tempoCasa, codigoProfessor)