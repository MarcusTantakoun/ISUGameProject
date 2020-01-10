package KeyboardHitman;


import java.util.ArrayList;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

abstract public class enemyParentObject {

    protected Rectangle hitbox;
    protected int hitboxdir;
    protected Image image;

    public enemyParentObject(int x, int y, String imgname) throws SlickException {
        image = new Image(imgname);
        hitboxdir--;
        hitbox = new Rectangle(x, hitboxdir, image.getHeight(), image.getWidth());
    }
    
    abstract public void move(ArrayList<Rectangle> barriers);
    //abstract public void randomWords();
    
    public void draw(){
        image.draw(hitbox.getX(), hitbox.getY());
    }
    
    public Rectangle getHitbox(){
        return hitbox;
    }
}
