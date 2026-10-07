fun main() {
println("Q1")
//Questão 1
fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10
        "PROMO20" -> valor - 20
        else -> valor
    }
}


    println("Cupom PROMO10: R$ ${calcularDesconto(100.0, "PROMO10")}")
    println("Cupom PROMO20: R$ ${calcularDesconto(100.0, "PROMO20")}")
    println("Cupom nulo: R$ ${calcularDesconto(100.0, null)}")
    println("Cupom inválido: R$ ${calcularDesconto(100.0, "OUTRO")}")

println("Q2")
//Questão 2
fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}


val listaEnderecos = listOf("Rua das Flores, 123", null, "Av. Brasil, 456", null, "Rua C, 789")

auditarEntregas(listaEnderecos)

println("Q3")
fun validarBioInfantil(bio: String?) {

    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

    validarBioInfantil("Adoro desenhos animados e jogos.")
    validarBioInfantil(null)
    validarBioInfantil("a".repeat(51))

println("Q4")
    val transacoes: List<Double?> = listOf(50.0, null, 120.5, null, 10.0)
    var total: Double = 0.0

    for (transacao in transacoes) {
        if (transacao != null) {
            total += transacao
        } else {
            println("Transação ignorada")
        }
    }

    println("Total processado: R$ $total")

println("Q5")
fun avaliarMotorista(nota: Int?) {
    val notaSegura = nota ?: 0
    when (notaSegura) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.")
    }
}
    avaliarMotorista(5)
    avaliarMotorista(4)
    avaliarMotorista(3)
    avaliarMotorista(2)
    avaliarMotorista(1)
    avaliarMotorista(null)

println("Q6")
val calcularGorjeta: (Double?) -> Double = {
    if (it == null) {
        0.0
    } else if (it < 0) {
        0.0
    } else {
        it
    }
}

    println("Gorjeta nula: R$ ${calcularGorjeta(null)}")
    println("Gorjeta negativa: R$ ${calcularGorjeta(-5.0)}")
    println("Gorjeta válida: R$ ${calcularGorjeta(10.0)}")

println("Q7")
    fun limparEmails(emails: List<String?>) {
        var contasInvalidas = 0

        for (email in emails) {
            // Safe Call (?.) + Elvis (?:): se email for nulo, tamanho = 0
            val tamanho = email?.length ?: 0

            if (email == null || tamanho == 0) {
                contasInvalidas++
                println("Aviso: conta inválida encontrada. Deletando...")
            } else {
                println("Conta válida: $email")
            }
        }

        println("Total de contas que precisam ser apagadas: $contasInvalidas")
    }
     val emails = listOf("ana@email.com", null, "", "joao@email.com", "", null)
    limparEmails(emails)
}