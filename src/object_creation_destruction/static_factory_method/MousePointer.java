package object_creation_destruction.static_factory_method;

public class MousePointer extends Pointer{
    private boolean isLeftClick;

    public MousePointer(int x, int y, boolean isLeftClick) {
        super(x, y);
        this.isLeftClick = isLeftClick;
    }
}
