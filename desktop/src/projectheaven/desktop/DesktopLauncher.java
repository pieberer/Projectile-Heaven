package projectheaven.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import projectheaven.Main;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
// ok lol
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		config.setForegroundFPS(60);
		config.setTitle("Projectile Heaven");
		config.setWindowIcon("cat.png");
		config.setWindowedMode(626, 417);

		new Lwjgl3Application(new Main(), config);
	}
}