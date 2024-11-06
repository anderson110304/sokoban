public class Viewer extends JPanel {

    private Controller controller;

    public Viewer(Controller controller) {
        this.controller = controller;
        JFrame frame = new JFrame("Sokoban Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(400, 400);
        frame.setVisible(true);
        setFocusable(true);
        addKeyListener(new KeyHandler());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        GameObjects gameObjects = controller.getModel().getGameObjects();

        for (Wall wall : gameObjects.getWalls()) {
            wall.draw(g);
        }
        for (Box box : gameObjects.getBoxes()) {
            box.draw(g);
        }
        for (Home home : gameObjects.getHomes()) {
            home.draw(g);
        }
        gameObjects.getPlayer().draw(g);
    }

    private class KeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    controller.processInput(Direction.LEFT);
                    break;
                case KeyEvent.VK_RIGHT:
                    controller.processInput(Direction.RIGHT);
                    break;
                case KeyEvent.VK_UP:
                    controller.processInput(Direction.UP);
                    break;
                case KeyEvent.VK_DOWN:
                    controller.processInput(Direction.DOWN);
                    break;
            }
        }
    }

    public void repaint() {}
}
