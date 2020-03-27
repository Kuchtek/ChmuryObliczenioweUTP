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
    }
}

