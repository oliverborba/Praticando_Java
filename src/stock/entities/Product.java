package stock.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {//define que a quantidade de produtos informados aqui serão atribuidos a variavel produto
        this.quantity += quantity;//this atribui o objeto quantity a variavel quantity deste metodo
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + " , $ "
                + String.format("%.2f", price)//String format funciona como printf, podendo assim definir o número de casas após a vírgula
                + ", "
                + quantity
                + " unitis, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
