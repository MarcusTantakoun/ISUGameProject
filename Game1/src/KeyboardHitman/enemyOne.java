
import KeyboardHitman.enemyParentObject;
import java.util.ArrayList;
import java.util.Random;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class enemyOne extends enemyParentObject{
    
    boolean shieldDown = false;
    int xdir, ydir;

    public enemyOne(int x, int y, String imgname) throws SlickException {
        super(x, y, imgname);
        
        hitbox.setWidth(image.getWidth());
        hitbox.setHeight(image.getHeight());
    }

    public void move(ArrayList<Rectangle> barriers) {
        ydir++;
        hitbox.setY(ydir);
    }
    
    //public void doubleWord(){
        //if()
    //}
    
}
