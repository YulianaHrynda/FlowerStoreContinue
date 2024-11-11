package flower.store;

import lombok.Getter;

@Getter
public enum FlowerColor {
    
    RED("#FF0000"), 
    BLUE("#0000FF");

    private final String hexCode;

    FlowerColor(String hexCode) {
        this.hexCode = hexCode;
    }

    @Override
    public String toString() {
        return hexCode;
    }
}

