package 创建型模式.单例模式.基础单例_单线程;



public final class Singleton {
    private static Singleton instance;
    public String value;
    private Singleton(String value){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
