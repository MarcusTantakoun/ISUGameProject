
import org.newdawn.slick.*;

public class testenemy extends BasicGame {
    
    SpriteSheet sprite,sprite2;
    Animation ani, ani2;

    public testenemy(String title) {
        super(title);
    }

    public void init(GameContainer gc) throws SlickException {
        sprite = new SpriteSheet("images/enemy1.png",32,50);
        sprite2 = new SpriteSheet("images/enemy2.png",35,59);
        ani2 = new Animation(sprite2,100);
        ani = new Animation(sprite,100);
    }

    public void update(GameContainer gc, int i) throws SlickException {
        
    }

    public void render(GameContainer gc, Graphics g) throws SlickException {
        ani2.draw(200,100);
        ani.draw(100,100);
    }

    public static void main(String args[]) throws SlickException {
        testenemy game = new testenemy("Testing Game");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(800, 600, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(100);
        app.start();
    }

}
