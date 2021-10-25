package FlowerStore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Flower {
    /*Implement a class Flower or system of classes that implement the essence of
    Rose, Chamomile, Tulip in a flower store. The class or classes should have attributes sepalLength, color, and price.
Propose an approach to represent flower color. What unexpected behavior default setter could have?
Implement FlowerPack class with attributes flower and amount. Implement method price in it
Implement FlowerBucket class that will aggregate several FlowePack. Implement method price in it.
What is the best way to implement price in FlowerBucket (check Law of Demetra)?
Implement class Store and method search in it
Add tests to project
Submit a project to GitHub
Setup GitHub Actions for this project that would run these tests. Hint.
Send link to your Github here*/
    @Getter @Setter
    protected FlowerType flowerType;


    public int getPrice(){
        return flowerType.getPrice();
    }
    public FlowerType getFlowerType(){
        return this.flowerType;
    }

    @Override
    public String toString() {
        return (this.flowerType + "{sepal_len=" + this.flowerType.getSepalLength() + ", price=" + this.flowerType.getPrice() + "$}");
    }
}
