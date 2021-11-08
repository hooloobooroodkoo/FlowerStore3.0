package user;

public class Sender implements User{
    private Boolean status;
    public int idCounter = 0;
    public int id;
    public Sender() {
        this.id  = idCounter++;
    }
    public void update() {
        if (this.status == true) {
            System.out.println("The order is processed...");
        }
    }
}
