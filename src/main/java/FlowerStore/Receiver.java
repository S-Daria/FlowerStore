package FlowerStore;

public class Receiver implements User{
    int id;
    public void update(String status){
    }
    public Receiver(){
        this.id = (int)Math.floor(Math.random()*(1000*1000*1000-1000*1000)+1000*1000);
    }
}
