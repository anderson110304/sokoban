import controller.LevelLoader;
import model.GameObjects;
import view.Viewer;

public class Main {
    public static void main(String[] args) {
        LevelLoader levelLoader = new LevelLoader();
        GameObjects gameObjects = levelLoader.loadLevel("level1");

        Viewer viewer = new Viewer(gameObjects);
    }
}
