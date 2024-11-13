package flower.store.deliveries;

import lombok.AllArgsConstructor;
import flower.store.Item;

import java.util.LinkedList;

@AllArgsConstructor
public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String deliver(LinkedList<Item> items) {
        System.out.println("The shipment is covered by DHL");

        StringBuilder result = new StringBuilder();
        for (Item currentItem : items) {
            result.append(currentItem.getDescription()).append(" ");
        }

        return result.toString().strip();
    }
}