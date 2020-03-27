package UTP;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    private static String projectName = "ChmuryObliczeniowe - Lab 1";

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Nazwa projektu: "+ projectName);
        String version = System.getProperty("java.version");
        System.out.println("Java version(JDK): " + version);
        version = System.getProperty("java.runtime.version");
        System.out.println("Java runtime version(JRE): "+version);
    }
}

