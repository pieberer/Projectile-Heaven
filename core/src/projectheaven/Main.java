package projectheaven;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Main extends ApplicationAdapter {
	Viewport viewport;
	Image backgroundImage;

	ShapeRenderer proj;
	ShapeRenderer player;

	Stage stage;

	int playerx;
	int playery;

	final int playerLength = 20;
	final int playerHeight = 20;

	int count;

	@Override
	public void create () {
		viewport = new FitViewport(626, 417);

		proj = new ShapeRenderer();
		player = new ShapeRenderer();

		stage = new Stage(new ScreenViewport());
		backgroundImage = new Image(new Texture("bg.png"));
		stage.addActor(backgroundImage);

		SpriteBatch batch = new SpriteBatch();

		playerx = 626 / 2;
		playery = 417 / 2;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();

		if (Gdx.input.isKeyPressed(Input.Keys.W)) {
			if (playery + playerHeight < 417)
				playery += 10;
		} if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			if (playerx > 0)
				playerx -= 10;
		} if (Gdx.input.isKeyPressed(Input.Keys.S)) {
			if (playery > 0)
				playery -= 10;
		} if (Gdx.input.isKeyPressed(Input.Keys.D)) {
			if (playerx + playerLength < 626)
				playerx += 10;
		}

		player.begin(ShapeRenderer.ShapeType.Filled);
		player.setColor(Color.WHITE);
		player.rect(playerx, playery, playerLength, playerHeight);
		player.end();


	}
	
	@Override
	public void dispose () {
		stage.dispose();
		proj.dispose();
		player.dispose();
	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height);
	}
}

class Projectile {
	// TODO
	// FIXME
	ShapeRenderer proj;
	int projX;
	int projY;
	Projectile() {

	}
	void update() {

	}
}