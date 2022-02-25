import java.util.Arrays;
import java.util.Scanner;

    //parem klõps -> refactor -> rename
public class Game2 {
    //main
    public static void main(String[] args) {
        world world = new world(5, 10);
        Player mangija1 = new Player(world.height, world.width);
        enemy vaenlane1 = new enemy(world.height, world.width);
        Item sword = new Item(world.height, world.width, ItemType.SWORD);
        Item hammer = new Item(world.height, world.width, ItemType.HAMMER);
        Item dagger = new Item(world.height, world.width, ItemType.DAGGER);
        world.items = Arrays.asList(sword, hammer, dagger);

        world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);

        // klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            mangija1.movePlayer(input, world.height, world.width);
            for (Item item:world.items) {
                if (item.coordinateX == mangija1.coordinateX && item.coordinateY == mangija1.coordinateY) {
                    mangija1.addItem(item);
                    break;
                }
            }

            world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
