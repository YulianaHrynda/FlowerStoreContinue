package flower.store.deliveries;

import lombok.NoArgsConstructor;
import flower.store.Item;

import java.util.LinkedList;

@NoArgsConstructor
public class PostDeliveryStrategy implements Delivery {

    @Override
    public String deliver(LinkedList<Item> items) {
        System.out.println("The shipment is covered by Post");

        StringBuilder result = new StringBuilder();
        for (Item currentItem : items) {
            result.append(currentItem.getDescription()).append(" ");
        }

        return result.toString().strip();
    }
}
