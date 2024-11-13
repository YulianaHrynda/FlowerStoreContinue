package flower.store.deliveries;
import flower.store.Item;

import java.util.LinkedList;

public interface Delivery {

    String deliver(LinkedList<Item> items);
}