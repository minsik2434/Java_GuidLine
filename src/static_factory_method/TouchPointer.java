package static_factory_method;

public class TouchPointer extends Pointer{
    private boolean touched;

    public TouchPointer(int x, int y, boolean touched) {
        super(x, y);
        this.touched = touched;
    }
}
