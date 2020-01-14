
import java.util.Random;
import org.newdawn.slick.*;

public class test extends BasicGame {

    String s;
    
    private String[] arr = {"apple", "because", "cockroach", "deliver", "enough", "growing", "helping", "indiana", "jackboys", "kangaroo", "large", "monster", "nothing", "octopus", "pressure", "queen", "respect", "sativa", "truthful", "wonderful", "xeno", "yellow", "zebra"};
    private Random random = new Random(); //randomize the words
    private int select = random.nextInt(arr.length); //select index
    private String original = arr[select]; //when word is typed, it reverts back to full word
    private int stringy, stringdir;

    int rights = 0;
    int mispelled = 0;
    int failed = 0;
    int time;

    public test(String title) {
        super(title);
    }

    public void init(GameContainer gc) throws SlickException {
        s = ""; //this is the typing input area
        stringy=-30;
        stringdir--;
        time = 0;
    }

    public void update(GameContainer gc, int i) throws SlickException {
        Input in = gc.getInput();
        int x = 0; //counter

        if (stringy == 710) {
            x = 0; //counter is back to 0
            s = ""; //input area is cleared
            failed++;
        }
        
        stringy = -stringdir;

        if (in.isKeyPressed(Input.KEY_A)) { //if a specific letter is pressed...
            if (arr[select].charAt(x) == 'a') { //if the first letter (x) of String is equal to specific letter...
                x++; //add counter to shift the String length to move to next letter
                if (x - arr[select].length() == 0) { //if counter is equal (sum of 0) to rest of length of word...
                    arr[select] = original; //make selected String revert back to its original
                    select = random.nextInt(arr.length); //select new String to display
                    original = arr[select]; //capture the original word of String before it is altered
                    x = 0; //counter is back to 0
                    s = ""; //input area is cleared
                    rights++;
                } else {
                    s = s + "a"; //add letter to inut area String
                    arr[select] = arr[select].substring(x, arr[select].length()); //make new String (shift the index right)
                }
                //if an incorrect letter is inputted, count mispelled
            } else {
                mispelled++;
            }
        }

        //code repeats itself but differs with each letter
        if (in.isKeyPressed(Input.KEY_B)) {
            if (arr[select].charAt(x) == 'b') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "b";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_C)) {
            if (arr[select].charAt(x) == 'c') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                } else {
                    s = s + "c";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_D)) {
            if (arr[select].charAt(x) == 'd') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "d";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_E)) {
            if (arr[select].charAt(x) == 'e') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "e";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_F)) {
            if (arr[select].charAt(x) == 'f') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "f";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_G)) {
            if (arr[select].charAt(x) == 'g') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "g";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_H)) {
            if (arr[select].charAt(x) == 'h') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "h";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_I)) {
            if (arr[select].charAt(x) == 'i') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "i";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_J)) {
            if (arr[select].charAt(x) == 'j') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "j";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_K)) {
            if (arr[select].charAt(x) == 'k') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "k";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_L)) {
            if (arr[select].charAt(x) == 'l') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "l";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_M)) {
            if (arr[select].charAt(x) == 'm') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "m";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_N)) {
            if (arr[select].charAt(x) == 'n') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "n";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_O)) {
            if (arr[select].charAt(x) == 'o') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "o";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_P)) {
            if (arr[select].charAt(x) == 'p') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "p";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_Q)) {
            if (arr[select].charAt(x) == 'q') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "q";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_R)) {
            if (arr[select].charAt(x) == 'r') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "r";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_S)) {
            if (arr[select].charAt(x) == 's') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "s";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_T)) {
            if (arr[select].charAt(x) == 't') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "t";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_U)) {
            if (arr[select].charAt(x) == 'u') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "u";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_V)) {
            if (arr[select].charAt(x) == 'v') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "v";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_W)) {
            if (arr[select].charAt(x) == 'w') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "w";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_X)) {
            if (arr[select].charAt(x) == 'x') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "x";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_Y)) {
            if (arr[select].charAt(x) == 'y') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "y";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
        if (in.isKeyPressed(Input.KEY_Z)) {
            if (arr[select].charAt(x) == 'z') {
                x++;
                if (x - arr[select].length() == 0) {
                    arr[select] = original;
                    select = random.nextInt(arr.length);
                    original = arr[select];
                    x = 0;
                    s = "";
                    rights++;
                    
                } else {
                    s = s + "z";
                    arr[select] = arr[select].substring(x, arr[select].length());
                }
            } else {
                mispelled++;
            }
        }
    }

    public void render(GameContainer gc, Graphics g) throws SlickException {
        g.drawString(s, 20, 670); //draw input String
        g.drawString(arr[select], 220, stringy);
        g.drawString("Rights: " + rights, 370, 620);
        g.drawString("Mispelled: " + mispelled, 370, 640);
        g.drawString("Failed: " + failed, 370, 660);
    }

    public static void main(String args[]) throws SlickException {
        test game = new test("Testing Game");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(500, 700, false);
        app.setShowFPS(false);
        app.setTargetFrameRate(70);
        app.start();
    }

}
