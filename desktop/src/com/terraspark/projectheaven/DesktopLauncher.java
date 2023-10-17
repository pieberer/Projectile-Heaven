package com.terraspark.projectheaven;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.terraspark.projectheaven.Main;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
// ok lol
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		config.setForegroundFPS(60);
		config.setTitle("Projectile Heaven");
		config.setWindowIcon("badlogic.jpg");

		new Lwjgl3Application(new Main(), config);
	}
}