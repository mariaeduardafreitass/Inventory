
package inventory;

public class ProductTester { 
public static void main(String[] args) {
//criar dois objetos usando o construtor padrão

Product p1 = new Product();
Product p2 = new Product();
//criar quatro objetos usando valores para os argumentos
//isso utilizará o construtor sobrecarregado
Product p3 = new Product(3, "Hot Shots", 75, 8.99);
Product p4 = new Product(4, "Brothers In Arms", 200, 7.75);
Product p5 = new Product(5, "Fantastic", 500, 9.50);
Product p6 = new Product(6, "The Party Album", 150, 4.00);
//exibir a descrição de cada objeto conforme descrito no
//método toString()
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
}//encerrar método principal
}//encerrar classe ProductTester
 
    
