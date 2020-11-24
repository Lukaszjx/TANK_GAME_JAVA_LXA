package GUI;

import Characters.Tank;
public class Move {
    public static void MoveTank(Tank t, Direction d) {
        t.setX(t.getX() + d.getDeltaX());
        t.setY(t.getY() + d.getDeltaY());
    }
}
