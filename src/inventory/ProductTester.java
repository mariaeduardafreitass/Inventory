
package inventory;

import java.util.InputMismatchException;
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
int maxSize=-1;
//solicitar que o usuário insira um número >= zero
do {
try{
//exibir prompt para o usuário
System.out.println("Insira o número de produtos que gostaria de adicionar.");
System.out.print("Insira 0 (zero) se não quiser adicionar produtos: ");
//supor que o usuário informe um valor válido
maxSize = in.nextInt();
if(maxSize<0)
System.out.println("Valor Incorreto inserido");
//endif
}
catch(InputMismatchException e) {
System.out.println("Tipo incorreto de dados inserido!");
in.nextLine();
}
catch(Exception e){
System.out.println(e);
in.nextLine();
}
}while(maxSize<0);
if(maxSize ==0) {
//Exibir uma mensagem de que não há produto se zero for inserido
System.out.println("Não há produtos!");
}else {
Product[] products = new Product[maxSize];
for(int i = 0; i<maxSize; i++) {
in.nextLine();
//pedir ao usuário para inserir as informações sobre o produto

System.out.print("\n\nInsira o nome do produto: ");
tempName = in.nextLine();
System.out.print("Insira a quantidade em estoque para este produto: ");
tempQty = in.nextInt();
System.out.print("Insira o preço para este produto: ");
tempPrice = in.nextDouble();
System.out.print("Insira o número do item: ");
tempNumber = in.nextInt();
//criar um objeto Produto e armazená-lo no array de produtos
products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
}//endfor
//exibir o conteúdo do array de produtos
for(Product product: products)
System.out.println(product);
//endor
}//endif
}//encerrar método principal
}//encerrar classe ProductTester