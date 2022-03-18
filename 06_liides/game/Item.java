package game;

public class Item implements WorldObject {
    int coordinateY;
    int coordinateX;
    double strength;
    ItemType itemType;

    public Item(int worldHeight, int worldWidth, ItemType itemType) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.itemType = itemType;
        determineStrength(itemType);  // ctrl + alt + m
    }

    private void determineStrength(ItemType itemType) {
        switch (itemType) {
            case SWORD:
                this.strength = 3;
                break;
            case HAMMER:
                this.strength = 2;
                break;
            case DAGGER:
                this.strength = 1;
                break;
        }
    }

    // Implementeerimine - kasutuselevõtmine
    public int generateRandomCoordinate(int worldSize) {
        return (int) ((Math.random()*(worldSize-2))+1); // cast
    }

    // Override - kirjutab vana üle
    @Override
    public String toString() {
        return "game.Item{" +
                "coordinateY=" + coordinateY +
                ", coordinateX=" + coordinateX +
                ", strength=" + strength +
                ", itemType=" + itemType +
                '}';
    }
}
