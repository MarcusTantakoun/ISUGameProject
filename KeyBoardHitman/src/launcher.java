
import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

public class launcher extends StateBasedGame {

    public launcher(String title) {
        super(title);
    }

    public void initStatesList(GameContainer gc) throws SlickException {

        this.addState(new officialGame());
    }

    public static void main(String args[]) throws SlickException {
        launcher game = new launcher("Keyboard Hitman");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(500, 900, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(60);
        app.start();
    }

}
