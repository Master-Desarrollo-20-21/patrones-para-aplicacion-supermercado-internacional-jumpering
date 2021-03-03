public class SpainTicket extends Ticket{

    @Override
    public Line getSoldLine(Product product) {
        return new SpainSoldLine(product);
    }

    @Override
    public Line getRepeatLine(Product product) {
        return new SpainSoldLine(product);
    }

    @Override
    public Header getHeader() {
        return new SpainHeader();
    }

    @Override
    public boolean isClose() {
        return false;
    }
}
