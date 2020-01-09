
import KeyboardHitman.enemyParentObject;
import java.util.ArrayList;
import java.util.Random;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;


public class enemyOne extends enemyParentObject{
    
    int xdir, ydir, target;

    public enemyOne(int x, int y, String imgname) throws SlickException {
        super(x, y, imgname);
        
        hitbox.setWidth(image.getWidth());
        hitbox.setHeight(image.getHeight());
    }

    public void move(ArrayList<Rectangle> barriers) {
        int x = (int) hitbox.getX();
        int y = (int) hitbox.getY();
        
        x+=xdir;
        y+=ydir;
        
        hitbox.setY(y);
        hitbox.setX(x);
    }

    @Override
    public void randomWords() {
         String[]arr = {"Man", "yett", "crazy"};
         Random random = new Random();
         int select = random.nextInt(arr.length);
    }
    
}
