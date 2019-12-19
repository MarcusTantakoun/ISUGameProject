
import java.util.ArrayList;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class OfficialGame extends BasicGameState {

    private ArrayList<Asteroid> rocks;
    private int timer1 = 0;
    private double timer2 = 0;
    private TrueTypeFont font;

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        rocks = new ArrayList();
        for (int i = 0; i < 20; i++) {
            int xloc = (int) (Math.random() * 750);
            int yloc = (int) (Math.random() * 500 + 50);
            rocks.add(new Asteroid(xloc, yloc));
        }

        Asteroid.setGameSize(800, 600);
        rocks.get(10).setChosen();
        font = new TrueTypeFont(new java.awt.Font("Impact", 0, 18), true);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input in = gc.getInput();
        int mx = in.getMouseX();
        int my = in.getMouseY();

        for (Asteroid a : rocks) {
            a.move();
        }

        if (in.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
            //go through all rocks and see if any get hit
            for (int j = 0; j < rocks.size(); j++) {
                if (rocks.get(j).isHit(mx, my) && rocks.get(j).isChosen()) {
                    rocks.remove(j);
                    if (rocks.size() > 0) {
                        pickrock();
                        break;
                    }
                }
            }
        }
        if (rocks.size() > 0) {
            timer2++;
            timer1++;
            if (timer1 == 500) {
                timer1 = 0;
                //add another asteroid
                int xloc = (int) (Math.random() * 750);
                int yloc = (int) (Math.random() * 500 + 50);
                rocks.add(new Asteroid(xloc, yloc));
            }
        }
        
        if(rocks.size() == 0){
            sbg.enterState(2, new FadeOutTransition(), new FadeInTransition());
        }
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        for (Asteroid a : rocks) {
            a.draw();
        }

        g.setColor(new Color(0, 100, 0));
        g.fill(new Rectangle(0, 0, 800, 40));

        font.drawString(10, 10, "Rocks to go: " + rocks.size(), Color.white);
        font.drawString(700, 10, "Time: " + timer2 / 100, Color.white);
    }

    public void pickrock() {
        int x = (int) (Math.random() * rocks.size());
        rocks.get(x).setChosen();
    }

    public int getID() {
        return 1;  //this id will be different for each screen
    }
}
