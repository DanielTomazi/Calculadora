package br.com.TomaziTecnologies.Calculadora;
import java.util.Scanner;

    public class Calculadora {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            System.out.println("Calculadora Simples");

            while (continuar) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o operador (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0.0;

                switch (operator) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida!");
                            continue; // Volta ao início do loop para uma nova operação
                        }
                        break;
                    default:
                        System.out.println("Operador inválido!");
                        continue; // Volta ao início do loop para uma nova operação
                }

                System.out.println("Resultado: " + resultado);

                System.out.print("Deseja fazer outra operação? (S/N): ");
                char resposta = scanner.next().charAt(0);
                if (resposta == 'N' || resposta == 'n') {
                    continuar = false;
                }
            }

            System.out.println("Obrigado por usar a calculadora!");
            scanner.close();
        }
    }
