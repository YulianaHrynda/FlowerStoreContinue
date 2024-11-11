package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        if (flower != null) {
            this.color = flower.color;
            this.sepalLength = flower.sepalLength;
            this.price = flower.price;
            this.flowerType = flower.flowerType;
        }
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public String getColor() {
        return color != null ? color.toString() : null;
    }
}
