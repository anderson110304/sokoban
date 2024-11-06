import java.awt.Color;
import java.awt.Graphics;

public class Home extends GameObject {

  public Home(int x, int y) {
    super(x, y);
  }

  @Override
  public void draw(Graphics g) {
      g.setColor(Color.GREEN);
      g.fillRect(x, y, size, size);
  }
}
