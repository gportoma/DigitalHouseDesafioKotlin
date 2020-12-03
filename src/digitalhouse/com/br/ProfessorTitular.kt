package digitalhouse.com.br

class ProfessorTitular(
    nome: String,
    sobrenome: String,
    tempoCasa: Int,
    codigoProfessor: Int,
    val especialidade: String
) : Professor(nome, sobrenome, tempoCasa, codigoProfessor)