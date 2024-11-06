import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject implements Movable {

  public Player(int x, int y) {
    super(x, y);
  }

  @Override
  public void draw(Graphics g) {
      g.setColor(Color.BLUE);
      g.fillOval(x, y, size, size);
  }

  @Override
  public void move() {}
}
