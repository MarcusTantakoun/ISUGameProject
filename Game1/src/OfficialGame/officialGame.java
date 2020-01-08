

import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

public class officialGame extends StateBasedGame {

    public officialGame(String title) {
        super(title);
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
       this.addState(new titleScreen());
       //this.addState(new menuScreen());
       //this.addState(new realGame());
       //this.addState(new gameoverScreen());
    }

    public static void main(String args[]) throws SlickException {
        officialGame game = new officialGame("Space Invader");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(800, 600, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(200);
        app.start();
    }

}
