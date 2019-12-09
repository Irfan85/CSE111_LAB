package Lab10.Task07;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.radius += super.radius*((1.0*percent)/100);
    }
}
