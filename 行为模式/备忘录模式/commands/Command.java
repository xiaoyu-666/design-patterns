package 行为模式.备忘录模式.commands;

public interface Command {
    String getName();
    void execute();
}