package AsteroidClicker;


import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.geom.Rectangle;

public class Asteroid {

    //instance variable
    private Image img;
    private Rectangle hitbox;
    //controls rock movement
    private int xdir, ydir;
    //class level variable
    private boolean isChosen;
    private static int GAME_WIDTH;
    private static int GAME_HEIGHT;
    private TrueTypeFont font;

    public Asteroid(int x, int y) throws SlickException {
        img = new Image("images/astroid.png");
        hitbox = new Rectangle(x, y, img.getWidth(), img.getHeight());
        
        font = new TrueTypeFont(new java.awt.Font("Impact",0,18),true);

        //move asteroid in random direction
        while (true) {
            //-3,-2,-1,0,1,2,3 = 7
            xdir = (int) (Math.random() * 7 - 3);
            ydir = (int) (Math.random() * 7 - 3);
            if (xdir != 0 && ydir != 0) {
                break;
            }
        }
        isChosen = false; //can only click on chosen rock
    }

    public static void setGameSize(int x, int y) {
        GAME_WIDTH = x;
        GAME_HEIGHT = y;
    }

    public void draw() {
        if(isChosen) img.setColor(1, 200, 0, 0, 0.5f);
        img.draw(hitbox.getX(), hitbox.getY());
    }
    
    public void setChosen(){
        isChosen = true;
    }
    
    public boolean isChosen(){
        return isChosen;
    }

    public void move() {
        //apply ax & y direction to hitbox
        hitbox.setX(hitbox.getX() + xdir);
        hitbox.setY(hitbox.getY() + ydir);

        //if we hit a wall, change direction
        if (hitbox.getX() <= 0 || hitbox.getX() >= GAME_WIDTH - hitbox.getWidth()){
            xdir = -xdir;
        }
        if (hitbox.getY() <= 40 || hitbox.getY() >= GAME_HEIGHT  - hitbox.getHeight()) {
            ydir = -ydir;
        }
    }
    
    public boolean isHit(int mx, int my){
        return hitbox.contains(mx,my);
    }

}
