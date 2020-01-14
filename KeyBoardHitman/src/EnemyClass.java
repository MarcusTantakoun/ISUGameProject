
import java.util.Random;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

public class EnemyClass {

    //list of random words String array
    private static String[] arr = {"apple", "because", "cockroach", "deliver", "enough", "growing", "helping", "indiana", "jackfruit", "kangaroo", "large", "monster", "nothing", "octopus", "pressure", "queen", "respect", "sativa", "truthful", "wonderful", "xeno", "yellow", "zebra"};
    private Random random = new Random(); //randomize the words

    private int stringy, stringx; //x and y direction of words
    private Rectangle hitbox; //create hitbox for strings

    //y coordinates of main character location
    private static int mainCharY;

    //actual word selected
    private String actualWord;
    private boolean isChosen;

    private int timer;

    //constructor for enemy
    public EnemyClass(int x, int y) throws SlickException {
        int select = random.nextInt(arr.length); //select index
        actualWord = arr[select]; //converts to string
        hitbox = new Rectangle(x, y, actualWord.length() * 10, 20); //make hitbox length of selected string
        isChosen = false;
        stringy = 1;
        stringx = 1;
        timer = 0;
    }

    //location where main character will be (stationary)
    public static void mainChar(int x, int y) {
        mainCharY = 840;
    }

    public int location() {
        return mainCharY;
    }

    //set movement of the strings
    public void move() {
        //set hitbox to follow string
        timer++;
        if (timer == 4) {
            timer = 0;
            if (hitbox.getX() < 200) {
                hitbox.setX(hitbox.getX() + (int) stringx);
            }
            if (hitbox.getX() > 200) {
                hitbox.setX(hitbox.getX() - (int) stringx);
            }
        }
        hitbox.setY(hitbox.getY() + stringy);

    }

    public void draw(Graphics g) {
        g.setColor(Color.white); //color of string
        g.fill(hitbox);
        g.setColor(Color.black); //hitbox is black (matches background)
        g.drawString(actualWord, hitbox.getX(), hitbox.getY()); //draw String
    }

    public boolean isCorrectLetter(char c) {
        int x = 0; //counter
        if (actualWord.charAt(x) == c) { //if the first letter (x) of String is equal to specific letter...
            x++; //add counter to shift the String length to move to next letter
            if (x < actualWord.length()) {
                actualWord = actualWord.substring(x, actualWord.length()); //make new String (shift the index right)
            } else {
                return true;
            }
        }
        return false;
    }

    public void setChosen() {
        isChosen = true;
    }

    public boolean isChosen() {
        return isChosen;
    }
}
