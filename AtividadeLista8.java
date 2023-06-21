class Bola {
    public String cor;
    public double circunferencia;
    public String material;

    public void trocaCor(String novaCor) {
        cor = novaCor;
    }

    public void mostraCor() {
        System.out.println("A cor da bola é: " + cor);
    }
}

class Quadrado {
    public double tamanhoLado;

    public void mudarValorLado(double novoValor) {
        tamanhoLado = novoValor;
    }

    public double retornarValorLado() {
        return tamanhoLado;
    }

    public double calcularArea() {
        return tamanhoLado * tamanhoLado;
    }
}

class Retangulo {
    public double ladoA;
    public double ladoB;

    public void mudarValorLados(double novoLadoA, double novoLadoB) {
        ladoA = novoLadoA;
        ladoB = novoLadoB;
    }

    public double retornarValorLadoA() {
        return ladoA;
    }

    public double retornarValorLadoB() {
        return ladoB;
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }

    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}

class Pessoa {
    public String nome;
    public int idade;
    public double peso;
    public double altura;

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            altura += 0.5;
        }
    }

    public void engordar(double pesoGanho) {
        peso += pesoGanho;
    }

    public void emagrecer(double pesoPerdido) {
        peso -= pesoPerdido;
    }

    public void crescer(double alturaCrescida) {
        altura += alturaCrescida;
    }
}

class ContaCorrente {
    public int numeroConta;
    public String nomeCorrentista;
    public double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldoInicial;
    }

    public void alterarNome(String novoNome) {
        nomeCorrentista = novoNome;
    }

    public void deposito(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void saque(double valorSaque) {
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class TV {
    public int numeroCanal;
    public int volume;

    public void trocarCanal(int novoCanal) {
        numeroCanal = novoCanal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}

class BichinhoVirtual {
    public String nome;
    public int fome;
    public int saude;
    public int idade;

    public void alterarNome(String novoNome) {
        nome = novoNome;
    }

    public void alterarFome(int novaFome) {
        fome = novaFome;
    }

    public void alterarSaude(int novaSaude) {
        saude = novaSaude;
    }

    public void alterarIdade(int novaIdade) {
        idade = novaIdade;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

    public int retornarHumor() {
        return fome + saude;
    }
}

class Macaco {
    public String nome;
    public String bucho;

    public void comer(String alimento) {
        bucho += alimento + " ";
    }

    public void verBucho() {
        System.out.println("Bucho: " + bucho);
    }

    public void digerir() {
        bucho = "";
        System.out.println("Bucho vazio.");
    }
}

class Ponto {
    public double x;
    public double y;

    public void imprimirValores() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }
}

class Retangulo {
    public Ponto vertice;

    public Ponto encontrarCentro() {
        Ponto centro = new Ponto();
        centro.x = vertice.x + largura / 2;
        centro.y = vertice.y + altura / 2;
        return centro;
    }
}

class BombaCombustivel {
    public String tipoCombustivel;
    public double valorLitro;
    public double quantidadeCombustivel;

    public void abastecerPorValor(double valorAbastecido) {
        double litrosAbastecidos = valorAbastecido / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Foram abastecidos " + litrosAbastecidos + " litros de combustível.");
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double litrosAbastecidos) {
        double valorPago = litrosAbastecidos * valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Valor a ser pago: R$" + valorPago);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    public void alterarValor(double novoValorLitro) {
        valorLitro = novoValorLitro;
    }

    public void alterarCombustivel(String novoTipoCombustivel) {
        tipoCombustivel = novoTipoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidadeCombustivel) {
        quantidadeCombustivel = novaQuantidadeCombustivel;
    }
}

class Carro {
    public double consumoCombustivel;
    public double quantidadeCombustivel;

    public void andar(double distancia) {
        double combustivelNecessario = distancia / consumoCombustivel;
        if (combustivelNecessario <= quantidadeCombustivel) {
            quantidadeCombustivel -= combustivelNecessario;
            System.out.println("Carro andou " + distancia + " km.");
        } else {
            System.out.println("Combustível insuficiente para percorrer a distância desejada.");
        }
    }

    public void adicionarCombustivel(double quantidade) {
        quantidadeCombustivel += quantidade;
    }

    public double obterCombustivel() {
        return quantidadeCombustivel;
    }
}

class ContaInvestimento {
    private double saldo;
    private double taxaJuros;

    public ContaInvestimento(double saldoInicial, double taxaJuros) {
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJuros;
    }

    public void adicionarJuros() {
        double juros = saldo * taxaJuros / 100;
        saldo += juros;
    }

    public double getSaldo() {
        return saldo;
    }
}

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentualDeAumento) {
        salario += salario * percentualDeAumento / 100;
    }
}

class BichinhoVirtualPlusPlus {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public BichinhoVirtualPlusPlus(String nome) {
        this.nome = nome;
        this.fome = 0;
        this.saude = 100;
        this.idade = 0;
    }

    public void alimentar(int quantidadeComida) {
        fome -= quantidadeComida;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar(int tempoBrincadeira) {
        saude += tempoBrincadeira;
        if (saude > 100) {
            saude = 100;
        }
    }

    public void passarTempo(int horas) {
        idade += horas;
        fome += horas * 2;
        saude -= horas;
        if (saude < 0) {
            saude = 0;
        }
    }

    public void exibirAtributosSecretos() {
        System.out.println("Nome: " + nome);
        System.out.println("Fome: " + fome);
        System.out.println("Saúde: " + saude);
        System.out.println("Idade: " + idade);
    }

    public String toString() {
        return "BichinhoVirtualPlusPlus [nome=" + nome + ", fome=" + fome + ", saude=" + saude + ", idade=" + idade + "]";
    }
}

import java.util.ArrayList;
import java.util.List;

class FazendaBichinhos {
    private List<BichinhoVirtualPlusPlus> bichinhos;

    public FazendaBichinhos() {
        bichinhos = new ArrayList<>();
    }

    public void adicionarBichinho(BichinhoVirtualPlusPlus bichinho) {
        bichinhos.add(bichinho);
    }

    public void alimentarTodos(int quantidadeComida) {
        for (BichinhoVirtualPlusPlus bichinho : bichinhos) {
            bichinho.alimentar(quantidadeComida);
        }
    }

    public void brincarComTodos(int tempoBrincadeira) {
        for (BichinhoVirtualPlusPlus bichinho : bichinhos) {
            bichinho.brincar(tempoBrincadeira);
        }
    }

    public void ouvirTodos() {
        for (BichinhoVirtualPlusPlus bichinho : bichinhos) {
            System.out.println("O bichinho " + bichinho.getNome() + " está falando: Olá!");
        }
    }
}