package AsteroidClicker;

import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

public class MainGame extends StateBasedGame {

    public MainGame(String title) {
        super(title);
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
       this.addState(new Intro());
       this.addState(new OfficialGame());
       this.addState(new GameOver());
    }

    public static void main(String args[]) throws SlickException {
        MainGame game = new MainGame("Asteroid Clicker");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(800, 600, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(100);
        app.start();
    }

}