package projectheaven.physics;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Hitbox {
    private int x;
    private int y;
    private int wid;
    private int heig;

    private ShapeRenderer renderer;

    public Hitbox(int x, int y, int wid, int heig) {
        this.x = x;
        this.y = y;
        this.wid = wid;
        this.heig = heig;

        renderer = new ShapeRenderer();
    }
}
