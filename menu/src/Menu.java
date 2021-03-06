import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> listOfDishes;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> listOfDishes, Date lastUpdated) {
        this.listOfDishes = listOfDishes;
        this.lastUpdated = lastUpdated;
    }

    public void add(MenuItem m){
        if(!listOfDishes.contains(m)) {
            listOfDishes.add(m);
            this.lastUpdated = new Date();
        }
    }

    public void remove(MenuItem m){
        listOfDishes.remove(m);
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "listOfDishes=" + listOfDishes +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
