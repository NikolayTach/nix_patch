import java.awt.event.MouseEvent;
import javax.swing Component;

public class CustomMouseEvent extends MouseEvent {
    private final int offsetX, offsetY;

    public CustomMouseEvent(Component component, long when, int x, int y, int button, 
boolean cancel) {
        super(component, when, button, x, y, cancel);
        this.offsetX = x - (int) getComponent().getLocation().x;
        this.offsetY = y - (int) getComponent().getLocation().y;
    }

    public CustomMouseEvent(Component component, long when, int x, int y, int button, 
boolean cancel, int offsetX, int offsetY) {
        super(component, when, button, x, y, cancel);
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    // Getters and Setters
    public int getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(int offsetX) {
        this.offsetX = offsetX;
    }

    public int getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(int offsetY) {
        this.offsetY = offsetY;
    }
}
