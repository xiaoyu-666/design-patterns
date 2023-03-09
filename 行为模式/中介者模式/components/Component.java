package 行为模式.中介者模式.components;

import 行为模式.中介者模式.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}