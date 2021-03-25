import java.awt.*;

class Balloon {
    private int diameter = 10;
    private int x = 20, y = 50;
    Graphics g;

    public void display(Graphics g) {
        g.drawOval(x, y, diameter, diameter);
    }

    public void left() {
        x = x - 100;
    }

    public void right() {
        x = x + 100;
    }

    public void up() {
        y = y - 100;
    }

    public void down() {
        y = y + 100;
    }

    public void grow() {
        diameter = diameter + 5;
    }

    public void shrink() {
        diameter = diameter - 5;
    }
}