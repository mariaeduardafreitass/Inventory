
package inventory;

/**
 *
 * @author Eduarda
 */
public class Product {
   //Declarações de campo de instância
private int itemNumber; //valor exclusivo para identificação
private String name; //nome do produto
private int qtyInStock; //quantidade em estoque
private double price; //preço do produto
//construtor padrão que inicializa as variáveis de instância
//os valores numéricos são 0 (zero) e os valores de String são "" (nulo)
public Product()
{
}//encerrar construtor
//construtor que permite a definição dos valores iniciais para Produtos
public Product(int number, String name, int qty, double price)
{
this.itemNumber = number;
this.name = name;
this.qtyInStock = qty;
this.price = price;
}//encerrar construtor
//retorna o valor atual de itemNumber
public int getItemNumber() {
return itemNumber;
}//encerrar método getItemNumber
//atualiza o valor itemNumber
public void setItemNumber(int itemNumber) {
this.itemNumber = itemNumber;
}//encerrar método setItemNumber
//retorna o valor atual do nome
public String getName() {
return name;
}//encerrar método getName
///atualiza o valor do nome
public void setName(String name) {
this.name = name;
}//encerrar método setName
//retorna o valor atual de qtyInStock
public int getQtyInStock() {
return qtyInStock;
}//encerrar método getQtyInStock
//atualiza o valor de qtyInStock
public void setQtyInStock(int qtyInStock) {
this.qtyInStock = qtyInStock;
}//encerrar método setQtyInStock 
//retorna o valor atual do preço
public double getPrice() {
return price;
}//encerrar método getPrice
//atualiza o valor do preço
public void setPrice(double price) {
this.price = price;
}//encerrar método setPrice
//substituir Método toString() da classe Objeto
//para permitir a exibição de cada objeto na console
public String toString()
{
return "\n\nItem Number : " + this.itemNumber
+ "\nName : " + this.name
+ "\nQuantity in stock: " + this.qtyInStock
+ "\nPrice : " + this.price;
}//encerrar método toString
}//encerrar classe Produto
