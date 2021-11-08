package user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Receiver implements User{
    public Boolean status;
    public int idCounter = 0;
    public int id;
    public Receiver() {
        this.id  = idCounter++;
    }

    public void update() {
        if (this.status == true) {
            System.out.println("The order is processed...");
        }
    }

}
