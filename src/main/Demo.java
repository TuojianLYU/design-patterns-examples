package src.main;

import src.app.Application;
import src.factories.GUIFactory;
import src.factories.MacOSFactory;
import src.factories.WindowsOSFactory;

import java.util.Locale;

public class Demo {

    private static Application configureApplication(){

        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsOSFactory();
            app = new Application(factory);
        }

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
