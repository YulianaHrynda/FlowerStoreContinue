package flower.store;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerBucket extends Item{
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    private String description;

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        updateDescription();
    }

    public double getPrice() {
        return flowerPacks.stream().mapToDouble(FlowerPack::getPrice).sum();
    }

    private void updateDescription() {
        StringBuilder desc = new StringBuilder();
        for (FlowerPack pack : flowerPacks) {
            desc.append(pack.getQuantity())
                .append(" ")
                .append(pack.getFlower().getColor().toString().toLowerCase())
                .append(" flowers, ");
        }
        description = desc.toString().replaceAll(", $", ""); // Remove trailing comma and space
    }

    public String getDescription() {
        return description != null ? description : "No description available";
    }
}
