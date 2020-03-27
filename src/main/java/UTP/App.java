package UTP;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println("Java version(JDK): " + version);
        version = System.getProperty("java.runtime.version");
        System.out.println("Java runtime version(JRE): "+version);

        String authorDEV1 = new DEV1().author;
        System.out.println("Autor DEV1: "+authorDEV1);
        String authorDEV2 = new DEV2().author;
        System.out.println("Autor DEV2: "+authorDEV2);
    }
}

