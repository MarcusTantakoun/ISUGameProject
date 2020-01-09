
import KeyboardHitman.enemyParentObject;
import java.util.ArrayList;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;


public class enemyTwo extends enemyParentObject{
    
    int xdir, ydir;

    public enemyTwo(int x, int y, String imgname) throws SlickException {
        super(x, y, imgname);
        hitbox.setWidth(image.getWidth());
        hitbox.setHeight(image.getHeight());
    }

    @Override
    public void move(ArrayList<Rectangle> barriers) {
        int x = (int) hitbox.getX();
        int y = (int) hitbox.getY();
        
        x+=xdir;
        y+=ydir;
        
        hitbox.setY(y);
        hitbox.setX(x);
    }
    
}
