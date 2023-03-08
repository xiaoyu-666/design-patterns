package 结构型模式.装饰模式.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
