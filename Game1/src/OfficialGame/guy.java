
import org.newdawn.slick.*;

public class guy extends BasicGame {

    private Animation ani[] = new Animation[3];
    private Image walk[][] = new Image[3][3];
    private Image stopImage[] = new Image[3];
    private SpriteSheet Guy;
    private boolean stopped;

    int guyx = 100, guyy = 100;
    int dir = 3;

    public guy(String title) {
        super(title);
    }

    public void init(GameContainer gc) throws SlickException {
        Guy = new SpriteSheet("images/introSpriteCharacter.png", 96, 96);
        Guy.startUse();
        for (int i = 0; i < 3; i++) {
            stopImage[i] = Guy.getSubImage(i, 0);
            for (int j = 0; j < 3; j++) {
                walk[i][j] = Guy.getSubImage(i, j);
            }
            ani[i] = new Animation(walk[i], 100);
        }
    }

    public void update(GameContainer gc, int i) throws SlickException {
        Input in = gc.getInput();
        stopped = false;

        if (in.isKeyDown(Input.KEY_RIGHT)) {
            guyx++;
            dir = 3;
        } else if (in.isKeyDown(Input.KEY_LEFT)) {
            guyx--;
            dir = 1;
        } else if (in.isKeyDown(Input.KEY_DOWN)) {
            guyy++;
            dir = 0;
        } else if (in.isKeyDown(Input.KEY_UP)) {
            guyy--;
            dir = 2;
        } else {
            stopped = true;
        }
    }

    public void render(GameContainer gc, Graphics g) throws SlickException {
        if (stopped) {
            ani[dir].stop();
            stopImage[dir].draw(guyx, guyy);
        } else {
            ani[dir].start();
            ani[dir].draw(guyx, guyy);
        }
    }

    public static void main(String args[]) throws SlickException {
        guy game = new guy("Testing Game");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(800, 600, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(100);
        app.start();
    }

}
