import java.awt.Color;
import java.awt.Graphics;

public class Wall extends GameObject {

  public Wall(int x, int y) {
    super(x, y);
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(Color.DARK_GRAY);
    g.fillRect(x, y, size, size);
  }
}
