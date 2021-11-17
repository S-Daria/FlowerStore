package FlowerStore;

public class Sender implements User{
    int id;
    public void update(String status){
    }
    public Sender(){
        this.id = (int)Math.floor(Math.random()*(1000*1000*1000-1000*1000)+1000*1000);
    }
}
