package dio.Singleton;

public class Test {
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);

        LazyHolder holder = LazyHolder.getInstance();
        System.out.println(holder);

    }
}
