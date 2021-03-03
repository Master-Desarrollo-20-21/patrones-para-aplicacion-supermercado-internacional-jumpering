import java.util.ArrayList;
import java.util.List;

public class Supermarket {


    private List<Ticket> ticketList;
    private Ticket ticket;


    public Supermarket(){
        this.ticketList = new ArrayList<>();
        this.ticket = new SpainTicket();
    }

    public void interact(){
        do{
            this.ticketList.add(new SpainTicket());//aplicar reflexion? Java //todo
        }while(isClose());

    }


    public boolean isClose(){
        //cierre caja//todo
        return false;
    }

    public static void main(String[] args) {
        new Supermarket().interact();
    }
}
