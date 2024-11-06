
X X X X X
X P B H X
X X X X X
public class LevelLoader {

    public GameObjects loadLevel(String filePath) {
        Set<Wall> walls = new HashSet<>();
        Set<Box> boxes = new HashSet<>();
        Set<Home> homes = new HashSet<>();
        Player player = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String objectType = parts[0];
                int x = Integer.parseInt(parts[1]);
                int y = Integer.parseInt(parts[2]);

                switch (symbol) {
                  case 'X':
                    walls.add(new Wall(x, y));
                    break;
                  case 'B':
                    boxes.add(new Box(x, y));
                    break;
                  case 'P':
                    player = new Player(x, y);
                    break;
                  case 'H':
                    homes.add(new Home(x, y));
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new GameObjects(walls, boxes, homes, player);
    }
}
