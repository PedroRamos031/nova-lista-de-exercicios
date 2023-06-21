import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double maiorNumero = Math.max(numero1, numero2);
        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}

import java.util.Scanner;

public class VerificarValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class VerificarGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra para representar o gênero (F/M): ");
        char genero = scanner.next().charAt(0);

        if (genero == 'F' || genero == 'f') {
            System.out.println("F - Feminino");
        } else if (genero == 'M' || genero == 'm') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class VerificarLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ||
                letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é uma vogal.");
        } else {
            System.out.println("A letra é uma consoante.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            if (media == 10) {
                System.out.println("Aprovado com Distinção");
            } else {
                System.out.println("Aprovado");
            }
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class TresMaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double maiorNumero = Math.max(numero1, Math.max(numero2, numero3));
        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double maiorNumero = Math.max(numero1, Math.max(numero2, numero3));
        double menorNumero = Math.min(numero1, Math.min(numero2, numero3));

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

        scanner.close();
    }
}

import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double precoProduto1 = scanner.nextDouble();
        System.out.print("Digite o preço do segundo produto: ");
        double precoProduto2 = scanner.nextDouble();
        System.out.print("Digite o preço do terceiro produto: ");
        double precoProduto3 = scanner.nextDouble();

        double menorPreco = Math.min(precoProduto1, Math.min(precoProduto2, precoProduto3));

        if (menorPreco == precoProduto1) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (menorPreco == precoProduto2) {
            System.out.println("Você deve comprar o segundo produto.");
        } else {
            System.out.println("Você deve comprar o terceiro produto.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class NumerosDecrescentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            if (numero2 >= numero3) {
                System.out.println(numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println(numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            if (numero1 >= numero3) {
                System.out.println(numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println(numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 >= numero2) {
                System.out.println(numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println(numero3 + ", " + numero2 + ", " + numero1);
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class SaudacaoTurno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Em qual turno você estuda? (M - Matutino / V - Vespertino / N - Noturno): ");
        String turno = scanner.next();

        String saudacao;

        if (turno.equalsIgnoreCase("M")) {
            saudacao = "Bom Dia!";
        } else if (turno.equalsIgnoreCase("V")) {
            saudacao = "Boa Tarde!";
        } else if (turno.equalsIgnoreCase("N")) {
            saudacao = "Boa Noite!";
        } else {
            saudacao = "Valor Inválido!";
        }

        System.out.println(saudacao);

        scanner.close();
    }
}

import java.util.Scanner;

public class SalarioReajustado {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
         double salario;
         double salfinal;
         double reajuste;
         double aumento;
        
        System.out.println("Seja bem vindo(a) as Organizações Tabajara.");
        System.out.println("Por favor digite o valor do seu salario:");
        salario = scanner.nextDouble();
        if (salario < 280){
            reajuste = (salario *20.0)/100;
            salfinal = (salario + reajuste);
            System.out.println("O valor do salário é de: R$"+salario);
            System.out.println("O percentual do aumento é de 20%");
            System.out.println("O valor do aumento é de: R$"+reajuste);
            System.out.println("O valor do salário após o reajuste é de: R$"+salfinal);
        }
        else if(salario >=280 && salario <700){
            reajuste = (salario *15.0)/100;
            salfinal = (salario + reajuste);
            System.out.println("O valor do salário é de: R$"+salario);
            System.out.println("O percentual do aumento é de 15%");
            System.out.println("O valor do aumento é de: R$"+reajuste);
            System.out.println("O valor do salário após o reajuste é de: R$"+salfinal);
        }
         else if(salario >=700 && salario <1500){
            reajuste = (salario *10.0)/100;
            salfinal = (salario + reajuste);
            System.out.println("O valor do salário é de: R$"+salario);
            System.out.println("O percentual do aumento é de 10%");
            System.out.println("O valor do aumento é de: R$"+reajuste);
            System.out.println("O valor do salário após o reajuste é de: R$"+salfinal);
    }
     else{
            reajuste = (salario *5.0)/100;
            salfinal = (salario + reajuste);
            System.out.println("O valor do salário é de: R$"+salario);
            System.out.println("O percentual do aumento é de 5%");
            System.out.println("O valor do aumento é de: R$"+reajuste);
            System.out.println("O valor do salário após o reajuste é de: R$"+salfinal);
     }
}
}

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        double descontoIR = 0;
        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        double descontoINSS = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = descontoIR + descontoINSS;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR (" + (descontoIR / salarioBruto) * 100 + "%): R$ " + descontoIR);
        System.out.println("(-) INSS (10%): R$ " + descontoINSS);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número correspondente ao dia da semana: ");
        int diaSemana = scanner.nextInt();

        String dia;

        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        scanner.close();
    }
}

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;
        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        String status = conceito.equals("A") || conceito.equals("B") || conceito.equals("C") ? "APROVADO" : "REPROVADO";

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println(status);

        scanner.close();
    }
}

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o valor do segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo válido.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
            scanner.close();
            return;
        }

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = false;

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class DataValida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = scanner.nextLine();

        int dia, mes, ano;
        try {
            dia = Integer.parseInt(data.substring(0, 2));
            mes = Integer.parseInt(data.substring(3, 5));
            ano = Integer.parseInt(data.substring(6, 10));
        } catch (NumberFormatException e) {
            System.out.println("A data informada é inválida.");
            scanner.close();
            return;
        }

        boolean dataValida = true;

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            dataValida = false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dataValida = false;
        } else if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                if (dia > 29) {
                    dataValida = false;
                }
            } else {
                if (dia > 28) {
                    dataValida = false;
                }
            }
        }

        if (dataValida) {
            System.out.println("A data informada é válida.");
        } else {
            System.out.println("A data informada é inválida.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class CentenasDezenasUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero >= 1000) {
            System.out.println("Número inválido.");
        } else {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = (numero % 100) % 10;

            String resultado = "";

            if (centenas > 0) {
                resultado += centenas + " centena(s)";
                if (dezenas > 0 && unidades > 0) {
                    resultado += ", ";
                } else if (dezenas > 0 || unidades > 0) {
                    resultado += " e ";
                }
            }

            if (dezenas > 0) {
                resultado += dezenas + " dezena(s)";
                if (unidades > 0) {
                    resultado += " e ";
                }
            }

            if (unidades > 0) {
                resultado += unidades + " unidade(s)";
            }

            System.out.println(numero + " = " + resultado);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 0 && media < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Média inválida");
        }

        scanner.close();
    }
	}
	
	import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        int valor = scanner.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido. O saque deve estar entre 10 e 600 reais.");
        } else {
            int[] notas = {100, 50, 10, 5, 1};
            int[] quantidadeNotas = new int[notas.length];

            for (int i = 0; i < notas.length; i++) {
                quantidadeNotas[i] = valor / notas[i];
                valor %= notas[i];
            }

            System.out.println("Notas fornecidas:");
            for (int i = 0; i < notas.length; i++) {
                if (quantidadeNotas[i] > 0) {
                    System.out.println(quantidadeNotas[i] + " nota(s) de " + notas[i] + " reais");
                }
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class InteiroOuDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero % 1 == 0) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class OperacoesNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão): ");
        int operacao = scanner.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        if (resultado % 2 == 0) {
            System.out.println("O resultado é par.");
        } else {
            System.out.println("O resultado é ímpar.");
        }

        if (resultado >= 0) {
            System.out.println("O resultado é positivo.");
        } else {
            System.out.println("O resultado é negativo.");
        }

        if (resultado % 1 == 0) {
            System.out.println("O resultado é um número inteiro.");
        } else {
            System.out.println("O resultado é um número decimal.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ClassificacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.print("Telefonou para a vítima? (s/n): ");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("s")) {
            count++;
        }

        System.out.print("Esteve no local do crime? (s/n): ");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("s")) {
            count++;
        }

        System.out.print("Mora perto da vítima? (s/n): ");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("s")) {
            count++;
        }

        System.out.print("Devia para a vítima? (s/n): ");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("s")) {
            count++;
        }

        System.out.print("Já trabalhou com a vítima? (s/n): ");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("s")) {
            count++;
        }

        if (countSim == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (count >= 3 && count <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (count == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class PostoCombustivel {
    public static void main (String[] args ){ 
	Scanner scanner = new Scanner(System.in);
        double valorLitroAlcool = 1.90;
        double valorLitroGasolina = 2.50;
        
        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        String tipoCombustivel = scanner.next();
        
        System.out.print("Digite a quantidade de litros: ");
        int quantidadeLitros = scanner.nextInt();
        
        double valorAPagar = 0.0;
        
        if (tipoCombustivel.equalsIgnoreCase("A")) {
            if (quantidadeLitros <= 20) {
                valorAPagar = quantidadeLitros * valorLitroAlcool * 0.97; // Desconto de 3%
            } else {
                valorAPagar = quantidadeLitros * valorLitroAlcool * 0.95; // Desconto de 5%
            }
        } else if (tipoCombustivel.equalsIgnoreCase("G")) {
            if (quantidadeLitros <= 20) {
                valorAPagar = quantidadeLitros * valorLitroGasolina * 0.96; // Desconto de 4%
            } else {
                valorAPagar = quantidadeLitros * valorLitroGasolina * 0.94; // Desconto de 6%
            }
        }
        
        System.out.println("Valor a pagar: R$" + valorAPagar);
		
		 scanner.close();
		 
		}
}

import java.util.Scanner;

public class Fruteira {
    public static void main (String[] args ){ 
	Scanner scanner = new Scanner(System.in);
        double valorMorangoAte5Kg = 2.50;
        double valorMorangoAcima5Kg = 2.20;
        double valorMacaAte5Kg = 1.80;
        double valorMacaAcima5Kg = 1.50;
        
        System.out.print("Digite a quantidade de morangos (em Kg): ");
        double quantidadeMorangos = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de maçãs (em Kg): ");
        double quantidadeMacas = scanner.nextDouble();
        
        double valorTotalMorangos = 0.0;
        double valorTotalMacas = 0.0;
        
        if (quantidadeMorangos <= 5) {
            valorTotalMorangos = quantidadeMorangos * valorMorangoAte5Kg;
        } else {
            valorTotalMorangos = quantidadeMorangos * valorMorangoAcima5Kg;
        }
        
        if (quantidadeMacas <= 5) {
            valorTotalMacas = quantidadeMacas * valorMacaAte5Kg;
        } else {
            valorTotalMacas = quantidadeMacas * valorMacaAcima5Kg;
        }
        
        double valorTotalCompra = valorTotalMorangos + valorTotalMacas;
        
        if (quantidadeMorangos + quantidadeMacas > 8 || valorTotalCompra > 25) {
            valorTotalCompra *= 0.9; // Desconto de 10%
        }
        
        System.out.println("Valor a pagar: R$" + valorTotalCompra);
		
		 scanner.close();
    }
}

import java.util.Scanner;

public class HipermercadoTabajara {
    public static void main (String[] args ){ 
	Scanner scanner = new Scanner(System.in);
        double valorFileDuploAte5Kg = 4.90;
        double valorFileDuploAcima5Kg = 5.80;
        double valorAlcatraAte5Kg = 5.90;
        double valorAlcatraAcima5Kg = 6.80;
        double valorPicanhaAte5Kg = 6.90;
        double valorPicanhaAcima5Kg = 7.80;
        
        System.out.print("Digite o tipo de carne (FD-file duplo, A-alcatra, P-picanha): ");
        String tipoCarne = scanner.next();
        
        System.out.print("Digite a quantidade (em Kg): ");
        double quantidade = scanner.nextDouble();
        
        System.out.print("Pagamento em cartão Tabajara? (S-sim, N-não): ");
        String pagamentoCartao = scanner.next();
        
        double valorTotal = 0.0;
        
        if (tipoCarne.equalsIgnoreCase("FD")) {
            if (quantidade <= 5) {
                valorTotal = quantidade * valorFileDuploAte5Kg;
            } else {
                valorTotal = quantidade * valorFileDuploAcima5Kg;
            }
        } else if (tipoCarne.equalsIgnoreCase("A")) {
            if (quantidade <= 5) {
                valorTotal = quantidade * valorAlcatraAte5Kg;
            } else {
                valorTotal = quantidade * valorAlcatraAcima5Kg;
            }
        } else if (tipoCarne.equalsIgnoreCase("P")) {
            if (quantidade <= 5) {
                valorTotal = quantidade * valorPicanhaAte5Kg;
            } else {
                valorTotal = quantidade * valorPicanhaAcima5Kg;
            }
        }
        
        double desconto = 0.0;
        
        if (pagamentoCartao.equalsIgnoreCase("S")) {
            desconto = valorTotal * 0.05; // Desconto de 5%
        }
        
        double valorAPagar = valorTotal - desconto;
        
        System.out.println("--- Cupom Fiscal ---");
        System.out.println("Tipo de carne: " + tipoCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$" + valorTotal);
        System.out.println("Tipo de pagamento: " + (pagamentoCartao.equalsIgnoreCase("S") ? "Cartão Tabajara" : "Outro"));
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Valor a pagar: R$" + valorAPagar);
		
		 scanner.close();
    }
}
