public class Controller {

    private Model model;
    private Viewer viewer;

    public Controller(Model model, View view) {
        this.model = model;
        this.viewer = view;
    }

    public void processInput(Direction direction) {
        model.movePlayer(direction);
        viewer.repaint();
    }
}
