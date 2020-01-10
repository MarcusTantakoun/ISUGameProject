package KeyboardHitman;



import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

public class gameLauncher extends StateBasedGame {

    public gameLauncher(String title) {
        super(title);
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
       this.addState(new titleScreen());
    this.addState(new realGame());
this.addState(new gameoverScreen());
    }

    public static void main(String args[]) throws SlickException {
        gameLauncher game = new gameLauncher("Space Invader");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(500, 900, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(200);
        app.start();
    }

}
