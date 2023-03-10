package com.yroom.decoratorMode.book;

/**
 * @author rui.yang
 */
public abstract class Decorator extends Component {
    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }

    }


}
