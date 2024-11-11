package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private final List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public List<FlowerPack> searchByType(FlowerType flowerType) {
        return flowerBuckets.stream()
                .flatMap(bucket -> bucket.getFlowerPacks().stream())
                .filter(pack -> pack.getFlower().getFlowerType().equals(flowerType))
                .collect(Collectors.toList());
    }
}
