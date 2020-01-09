
import KeyboardHitman.enemyParentObject;
import org.newdawn.slick.*;

public class realGame extends BasicGame {
    
    int timer = 0; // timer that spawns enemies in
    int lives = 3; //three lives
    int RIGHT = 0; //if the word is inputted correctly 5 times, then live++;
    //main player
    playerClass player;
    //three different types of enemies
    enemyParentObject enemy1;
    enemyParentObject enemy2;
    enemyParentObject enemy3;
    
    public realGame(String title) {
        super(title);
    }

    public void init(GameContainer gc) throws SlickException {
        player = new playerClass(0, 170);
        enemy1 = new enemyOne(100, 170, "images/ghost.png");
        enemy2 = new enemyTwo(700, 170, "images/ghost.png");
        enemy3 = new enemyThree(280, 400, "images/house.png");
    }

    public void update(GameContainer gc, int i) throws SlickException {
        if (player.isHitting(enemy1)) {
            
        }
    }

    public void render(GameContainer gc, Graphics g) throws SlickException {
        
    }

    public static void main(String args[]) throws SlickException {
        realGame game = new realGame("Keyboad Hitman");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(500, 900, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(100);
        app.start();
    }

}
