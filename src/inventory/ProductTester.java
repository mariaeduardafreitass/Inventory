
package inventory;

import java.util.Scanner;

public class ProductTester { 
    public static void main(String[] args) {
//criar um objeto Scanner para entrada do teclado
Scanner in = new Scanner(System.in);
//criar variáveis locais
int tempNumber;
String tempName;
int tempQty;
double tempPrice;
//pedir ao usuário para inserir as informações sobre o produto
System.out.print("\n\nInsira o nome do produto: ");
tempName = in.nextLine();
System.out.print("Insira a quantidade em estoque para este produto: ");
tempQty = in.nextInt();
System.out.print("Insira o preço para este produto: ");
tempPrice = in.nextDouble();
System.out.print("Insira o número do item: ");
tempNumber = in.nextInt();
//crie o primeiro produto usando as informações inseridas pelo usuário
Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);
//pedir ao usuário para inserir as informações sobre o produto
in.nextLine();
System.out.print("\n\nInsira o nome do produto: ");
tempName = in.nextLine();
System.out.print("Insira a quantidade em estoque para este produto: ");
tempQty = in.nextInt();
System.out.print("Insira o preço para este produto: ");
tempPrice = in.nextDouble();
System.out.print("Insira o número do item: ");
tempNumber = in.nextInt();
//criar dois objetos usando o construtor padrão
Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);
//fechar o objeto Scanner
in.close();
//criar quatro objetos usando valores para os argumentos
//isso utilizará o construtor sobrecarregado
Product p3 = new Product(3, "Hot Shots", 75, 8.99);
Product p4 = new Product(4, "Brothers In Arms", 200, 7.75);
Product p5 = new Product(5, "Fantastic", 500, 9.50);
Product p6 = new Product(6, "The Party Album", 150, 4.00);
//definir o campo Ativo como falso

p6.setActive(false);
//exibir a descrição de cada objeto conforme descrito no método toString()
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
}//encerrar método principal
}//encerrar classe ProductTester
