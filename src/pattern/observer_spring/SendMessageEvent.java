package pattern.observer_spring;

/**
 * Author: buleCode
 * Date: 2017/6/8
 */
public class SendMessageEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    SendMessageEvent(Object source) {
        super(source);
    }
}
