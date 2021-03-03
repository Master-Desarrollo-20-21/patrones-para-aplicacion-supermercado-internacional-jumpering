import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Ticket {

    private List<Line> lineList;
    protected double price;

    public Ticket() {
        this.lineList = new ArrayList<>();
        this.price = 0;
        this.generate();
    }

    public void generate() {
        this.getHeader().getHeaderText();
        do {
            System.out.println("");
            System.out.println("1. vender\n2. repetir\n3. anular");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    this.lineList.add(this.getSoldLine(getProductForTest()));
                    this.lineList.get(this.lineList.size()).execute();
                    this.price += this.lineList.get(this.lineList.size()).getTotalPrice();
                    break;
                case 2:
                    this.lineList.add(this.getRepeatLine(getProductForTest()));
                    break;
            }
            print();
        } while (this.isCompleted());
    }

    private boolean isCompleted() {
        return true;
    }

    private Product getProductForTest() {
        System.out.println("1. Apple\n2. Orange");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                Product apple = new Apple(15);
                apple.setCode(100);
                return apple;
            case 2:
                Product orange = new Orange(10);
                orange.setCode(200);
                return orange;
        }
        return null;
    }

    public abstract Line getSoldLine(Product product);

    public abstract Line getRepeatLine(Product product);

    public abstract Header getHeader();

    public abstract boolean isClose();

    public void print() {
        System.out.println("");
        System.out.println("Total acumulado: " + this.price);
        //this.lineList.forEach(e -> System.out.println(e.toString()));
    }
}
