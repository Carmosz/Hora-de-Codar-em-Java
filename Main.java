import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {

    // HORA DE CODAR

    // Exercicio 1

    // String planeta = "Plutão";
    // System.out.println(planeta);


    
    // Exercicio 2

    // System.out.println("Olá! Qual o seu nome?");
    // Scanner pergunta1 = new Scanner(System.in);
    // String nome = pergunta1.nextLine();
    // System.out.println("Olá! " + nome);


    
    // Exercicio 3

    // System.out.println("Escreva seu nome");
    // Scanner scan = new Scanner(System.in);
    // String nome = scan.nextLine();

    // System.out.println("Escreva sua idade");
    // int numero = scan.nextInt();

    // System.out.println(nome + ", sua idade é " + numero);


    
    // Exercicio 4

    // Area do retangulo

    // System.out.println("Digite a base do retangulo: ");
    // Scanner entrada = new Scanner(System.in);
    // float base = entrada.nextInt();
    // System.out.println("Digite a altura do retangulo;");
    // float altura = entrada.nextInt();
    // float area = base * altura;
    // System.out.println("A aread o retangulo é igual a: " + area);

    // A AREA DO QUADRADO

    // System.out.println("Digite o lado do quadrado: ");
    // Scanner entrada = new Scanner(System.in);
    // double lado = entrada.nextDouble();
    // double area = Math.pow(lado, 2);
    // System.out.println("A aread o retangulo é igual a: " + area);

    // Area do Losango

    // Scanner in = new Scanner(System.in);
    // System.out.println("Quanto mede a diagonal maior?");
    // int diagonal_maior = in.nextInt();
    // System.out.println("Quanto mede a diagonal menor?");
    // int diagonal_menor = in.nextInt();
    // int area = ((diagonal_maior * diagonal_menor) /2) ;
    // System.out.println( "A aréa do losango é igual a : " + area + ".");

    // Area do Trapézio

    // Scanner in = new Scanner(System.in);
    // System.out.println("Informe o valor da base maior");
    // int base_maior = in.nextInt();
    // System.out.println("Informe o valor da base menor");
    // int base_menor = in.nextInt();
    // System.out.println("Informe o valor da altura");
    // int altura = in.nextInt();
    // System.out.println("O valor da area do trapézio é "+ ((base_maior +
    // base_menor) * altura) /2);

    // Area do Paralelogramo

    // Scanner in = new Scanner(System.in);
    // System.out.println("Qual o valor da base?");
    // int base = in.nextInt();
    // System.out.println("Qual o valor da altura?");
    // int altura = in.nextInt();
    // int area = base * altura;
    // System.out.println( "A aréa do paralelogramo é igual a : " + area + ".");

    // Area do Triangulo

    // Scanner in = new Scanner(System.in);
    // System.out.println("Qual o valor da base?");
    // int base = in.nextInt();
    // System.out.println("Qual o valor da altura?");
    // int altura = in.nextInt();
    // int area = (base * altura) /2 ;
    // System.out.println( "A area do triangulo é igual a : " + area + ".");

    // Area do Circulo

    // Scanner in = new Scanner(System.in);
    // System.out.println("Qual o valor do raio?");
    // int raio = in.nextInt();
    // System.out.println( "A area do circulo é igual a : " + ((raio * raio)* 3.14)
    // + ".");


    
    // Exercicio 5

    // System.out.println("Escreva um valor");
    // Scanner scan = new Scanner(System.in);
    // int numero_usuario = scan.nextInt();
    // if (numero_usuario < 0){
    // System.out.println("Valor negativo.");
    // } else if (numero_usuario > 0) {
    // System.out.println("Valor positivo.");
    // } else {
    // System.out.println("Valor é 0.");
    // }


    
    // Exercicio 6

    // Scanner in = new Scanner(System.in);
    // System.out.println("Qual o primeiro valor?");
    // int numero1 = in.nextInt();
    // System.out.println("Qual o segundo valor?");
    // int numero2 = in.nextInt();
    // System.out.println("Qual o terceiro valor?");
    // int numero3 = in.nextInt();
    // double resultado = Math.max(numero1, Math.max(numero2,numero3));
    // System.out.println("O maior numero entre eles é " + resultado );


    
    // Exercicio 7

    // Scanner in = new Scanner(System.in);
    // System.out.println("Digite um numero: ");
    // int n1 = in.nextInt();
    // System.out.println("Digite mais um numero: ");
    // int n2 = in.nextInt();
    // System.out.println("Digite o ultimo numero: ");
    // int n3 = in.nextInt();
    // double menor = Math.min(n1, Math.min(n2,n3));
    // double valor = n1 + n2 + n3 - menor;
    // System.out.println("A soma dos dois maiores é: " + valor);


    
    // Exercicio 7.1

    // Scanner scanner = new Scanner(System.in);
    // int numero = 0;
    // int maior1 = 0;
    // int maior2 = 0;
    // for(int i = 0; i < 5; i++){
    // System.out.print("Digite um numero: ");
    // numero = scanner.nextInt();
    // if(numero > 0){
    // if(numero > maior1){
    // if(i >= 1){
    // maior2 = maior1;
    // }
    // maior1 = numero;
    // }else if(numero > maior2){
    // maior2 = numero;
    // }
    // }
    // }
    // int resultado = maior1 + maior2;
    // System.out.println("A soma dos maiores é: " + resultado);


    
    // REPITA COMIGO

    // Exercicio 8

    // Scanner in = new Scanner(System.in);

    // System.out.println("Digite o primeiro valor: ");
    // int n1 = in.nextInt();
    // System.out.println("Digite o segundo valor ");
    // int n2 = in.nextInt();

    // if( n2 <= 0) {
    // System.out.println("O numero não pode ser igual ou menor que ZERO (0), tente
    // novamente!");

    // System.out.println("Digite o segundo valor novamente! ");
    // n2 = in.nextInt();
    // }

    // int resultado = (n1 / n2);

    // System.out.println("O resultado da divisão é " + resultado + ".");


    
    // Exercicio 9

    // Scanner in = new Scanner(System.in);

    // int soma = 0 ;

    // for(int i = 0; i < 10; i++){
    // System.out.print("Digite um número: ");
    // int numero = in.nextInt();

    // soma += numero;
    // }

    // System.out.println("A soma dos números informados é " + soma / 10);

    // in.close();


    
    // Exercicio 10

    // Scanner in = new Scanner(System.in);
    // int soma = 0;
    // for(int i = 0; i < 4; i++ ){
    // System.out.print("Digite a nota do aluno: ");
    // int nota = in.nextInt();
    // soma += nota;
    // }
    // double media = soma/4;
    // System.out.println("Sua média foi " + media);
    // if( media >= 6 ){
    // System.out.println("PARABÉNS! Você foi aprovado !!");
    // } else {
    // System.out.println("Que pena :( Você foi reprovado !!");
    // }
    // in.close();


    
    // Exercicio 11

    // int contagem = 30;
    // while (contagem > 0) {
    // String textcontagem = "Contagem em " + contagem ;
    // System.out.println(textcontagem);
    // contagem = contagem - 1;
    // }
    // System.out.println("Explosão pluuuuuuuuuuuum ");


    
    // Exercicio 12

    // int contagem = 10;
    // int ultimo = 0;
    // while (contagem > ultimo) {
    // System.out.println (contagem );
    // contagem = contagem -=1;
    // }


    
    // Exercicio 13

    // Scanner in = new Scanner(System.in);
    // System.out.println("Digite o primeiro numero: ");
    // int n1 = in.nextInt();
    // System.out.println("Digite o segundo numero ");
    // int n2 = in.nextInt();
    // int contagem= n2 - n1;
    // while(n1 <= n2){
    // int num = contagem + n1;
    // System.out.println(num);
    // n1++;
    // }
    // int media = num / contagem;
    // System.out.println("A media aritmetica é: " + media);


    
    // Exercicio 14

    // Scanner scanner = new Scanner(System.in);
    // int n1 = 0;
    // int n2 = 0;
    // int i = 0;
    // int aprovados = 0;
    // String verificar;
    // char letra;

    // while(i < 1){
    // System.out.print("Digite a nota: ");
    // n1 = scanner.nextInt();
    // System.out.print("Digite a nota: ");
    // n2 = scanner.nextInt();
    // double media = (n1 + n2) / 2;

    // if(media >= 6.5){
    // aprovados++;
    // System.out.print("Deseja adicionar outro aluno? S/N: ");
    // verificar = scanner.next();
    // letra = verificar.charAt(0);
    // if(letra == 'S'){

    // }else if(letra == 'N'){
    // i++;
    // }
    // } else{
    // System.out.print("Deseja adicionar outro aluno? S/N: ");
    // verificar = scanner.next();
    // letra = verificar.charAt(0);
    // if(letra == 'S'){

    // }else if(letra == 'N'){
    // i++;
    // }
    // }
    // }
    // System.out.println("O total de alunos aprovados é: " + aprovados);

  }
}