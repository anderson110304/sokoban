import java.awt.Color;
import java.awt.Graphics;

public class Box extends GameObject implements Movable {

  public Box(int x, int y) {
    super(x, y);
  }

  @Override
  public void draw(Graphics g) {
      g.setColor(Color.ORANGE);
      g.fillRect(x, y, size, size);
  }

  @Override
  public void move() {}
}
