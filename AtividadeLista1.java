import java.util.Scanner;

public class AloMundo {
    public static void main(String[] args) {
        System.out.println("Alô mundo");
    }
}

import java.util.Scanner;

public class NumeroInformado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("O número informado foi: " + numero);

        scanner.close();
    }
}

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}

import java.util.Scanner;

public class ConversorMetrosCentimetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;

        System.out.println("O valor em centímetros é: " + centimetros + " cm");

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraAreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);

        double dobroArea = 2 * area;

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + dobroArea);

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que você ganha por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("O total do seu salário no mês é: R$ " + salario);

        scanner.close();
    }
}

import java.util.Scanner;

public class ConversorFahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5 * (fahrenheit - 32) / 9;

        System.out.println("A temperatura em graus Celsius é: " + celsius + " °C");

        scanner.close();
    }
}

import java.util.Scanner;

public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit + " °F");

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraOperacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        int produto = (numero1 * 2) * (numero2 / 2);
        double soma = (numero1 * 3) + numeroReal;
        double cubo = Math.pow(numeroReal, 3);

        System.out.println("Produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("Soma do triplo do primeiro com o número real: " + soma);
        System.out.println("Terceiro número elevado ao cubo: " + cubo);

        scanner.close();
    }
}

import java.util.Scanner;
public class PesoIdeal {
  
    public static void main (String[] args){
    String genero;

    double peso;
    double homem;
    double mulher;
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu genero (Homem/Mulher): ");
        genero = scanner.nextLine();
        

        System.out.println("Digite sua altura: ");

        peso = scanner.nextDouble();

        if(genero.equals ("Homem") ) {

        

        homem = ((72.7*peso)-58);
        System.out.printf("Seu peso ideal é de : %.2f" ,homem);}

    
        else if (genero.equals ("Mulher")){

        mulher = ((62.1*peso) - 44.7) ;
        System.out.printf("Seu peso ideal é de : %.2f", mulher);}

        else {
            System.out.println("Genero Invalido.");

        }

    }
}

import java.util.Scanner;

public class CalculoPeixes {
    public static void main (String[] args ){
        double peso;
        double excesso;
        double limite = 50;
        double multa;
        double preço;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o peso dos peixes em kilos: ");
        peso = scanner.nextDouble();

        
        if(peso > 50){
            excesso = peso - limite;
            multa = excesso * 4.0;
            
            System.out.println("João vai pagar R$ " +multa+ " de multa." );
        }
        else {
            System.out.println("O peso não foi excedido, não ha multas a pagar.");
        }

    }
    
}

import java.util.Scanner;

public class CalculadoraSalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que você ganha por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Valor pago ao INSS: R$ " + inss);
        System.out.println("Valor pago ao Sindicato: R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraTinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double tamanhoArea = scanner.nextDouble();

        double litrosTinta = tamanhoArea / 3;
        int latasTinta = (int) Math.ceil(litrosTinta / 18);
        int galoesTinta = (int) Math.ceil(litrosTinta / 3.6);

        double precoLatas = latasTinta * 80;
        double precoGaloes = galoesTinta * 25;

        System.out.println("Situação 1: Comprar apenas latas de tinta");
        System.out.println("Quantidade de latas de tinta: " + latasTinta);
        System.out.println("Preço total: R$ " + precoLatas);

        System.out.println();

        System.out.println("Situação 2: Comprar apenas galões de tinta");
        System.out.println("Quantidade de galões de tinta: " + galoesTinta);
        System.out.println("Preço total: R$ " + precoGaloes);

        System.out.println();

        System.out.println("Situação 3: Misturar latas e galões de tinta");
        int latasNecessarias = (int) Math.ceil(litrosTinta / 18);
        int galoesNecessarios = (int) Math.ceil((litrosTinta - (latasNecessarias * 18)) / 3.6);

        double precoLatasGaloes = (latasNecessarias * 80) + (galoesNecessarios * 25);

        System.out.println("Quantidade de latas de tinta: " + latasNecessarias);
        System.out.println("Quantidade de galões de tinta: " + galoesNecessarios);
        System.out.println("Preço total: R$ " + precoLatasGaloes);

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraTempoDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeLink = scanner.nextDouble();

        double tempoDownload = (tamanhoArquivo * 8) / velocidadeLink;
        double minutos = Math.ceil(tempoDownload / 60);

        System.out.println("Tempo aproximado de download: " + minutos + " minutos");

        scanner.close();
    }
}