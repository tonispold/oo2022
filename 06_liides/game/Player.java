package game;
// extends -- pärilus Inheritance 1x
// implements -- liides Interface ...x
public class Player extends Character implements WorldObject {
    Direction direction; // 3-ndast kodutööst
    Item item;

    public Player(int worldHeight, int worldWidth) {
        super(worldHeight, worldWidth); // super on sama mis new Character();
        this.direction = Direction.UP;
    }

    public void addItem(Item item) {
        this.item = item;
        System.out.println("Mängija sai eseme + " + item.itemType);
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        switch (input) {
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (coordinateX > 1) {
                    coordinateX--;
                }
                break;
            case DOWN:
                if (coordinateY < worldHeight-2) {
                    coordinateY++;
                }
                break;
            case RIGHT:
                if (coordinateX < worldWidth-2) {
                    coordinateX++;
                }
                break;
            case UP:
                if (coordinateY > 1) {
                    coordinateY--;
                }
                break;
        }
    }

    @Override
    public String toString() {
        return "game.Player{" +
                "coordinateY=" + coordinateY +
                ", coordinateX=" + coordinateX +
                ", direction=" + direction +
                ", item=" + item +
                '}';
    }
}