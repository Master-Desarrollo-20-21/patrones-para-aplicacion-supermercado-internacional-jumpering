import java.util.Scanner;

public class SpainSoldLine extends Line{

    private String name;
    private Product product;
    private double price;
    private int units;

    public SpainSoldLine(Product product){
        this.product = product;
        this.name = product.getClass().getName();
    }

    @Override
    public void execute(){
        System.out.println("imprimo castellano codigo producto: " + this.product.getCode());
        System.out.println("Insertar número de unidades: ");
        Scanner scanner = new Scanner(System.in);
        this.units = scanner.nextInt();
        System.out.printf("Total unidades " + this.units + " : " + this.getTotalPrice());
    }

    public double getTotalPrice(){
        this.price = (product.getPrice() + product.getPrice() * 0.21) * this.units;
        return this.price;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.price + " operaciones españolas";
    }

}
