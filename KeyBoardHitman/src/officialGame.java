
import java.util.ArrayList;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class officialGame extends BasicGameState implements KeyListener {

    String s;
    mainCharacter guy;

    private ArrayList<EnemyClass> word; //object for wordClass

    int rights = 0;
    int time;

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        guy = new mainCharacter(220, 830);
        s = ""; //this is the typing input area
        word = new ArrayList();
        time = 0;
    }

    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input in = gc.getInput();

            //get movement for word object (goes down)
            for (EnemyClass a : word) {
                a.move();
            }

        time++;
        //every three seconds add a new word
        if (time == 10) {
            time = 0;
            int xloc = (int) (Math.random() * 500);
            word.add(new EnemyClass(xloc, 20));
        }

        int x = 0;
        //search through, if the key pressed == string char location...
        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_A)) {
                if (word.get(j).isCorrectLetter('a') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) { //if counter is equal (sum of 0) to rest of length of word...
                        x = 0; //counter is back to 0
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "a";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_B)) {
                if (word.get(j).isCorrectLetter('b') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        pickWord();
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "b";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_C)) {
                if (word.get(j).isCorrectLetter('c') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "c";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_D)) {
                if (word.get(j).isCorrectLetter('d') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "d";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_E)) {
                if (word.get(j).isCorrectLetter('e') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "e";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_F)) {
                if (word.get(j).isCorrectLetter('f') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "f";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_G)) {
                if (word.get(j).isCorrectLetter('g') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "g";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_H)) {
                if (word.get(j).isCorrectLetter('h') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "h";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_I)) {
                if (word.get(j).isCorrectLetter('i') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "i";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_J)) {
                if (word.get(j).isCorrectLetter('j') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "j";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_K)) {
                if (word.get(j).isCorrectLetter('k') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "k";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_L)) {
                if (word.get(j).isCorrectLetter('l') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "l";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_M)) {
                if (word.get(j).isCorrectLetter('m') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "m";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_N)) {
                if (word.get(j).isCorrectLetter('n') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "n";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_O)) {
                if (word.get(j).isCorrectLetter('o') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "o";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_P)) {
                if (word.get(j).isCorrectLetter('p') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "p";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_Q)) {
                if (word.get(j).isCorrectLetter('q') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "q";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_R)) {
                if (word.get(j).isCorrectLetter('r') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "r";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_S)) {
                if (word.get(j).isCorrectLetter('s') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "s";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_T)) {
                if (word.get(j).isCorrectLetter('t') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "t";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_U)) {
                if (word.get(j).isCorrectLetter('u') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "u";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_V)) {
                if (word.get(j).isCorrectLetter('v') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "v";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_W)) {
                if (word.get(j).isCorrectLetter('w') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "w";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_X)) {
                if (word.get(j).isCorrectLetter('x') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "x";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_Y)) {
                if (word.get(j).isCorrectLetter('y') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "z";
                    }
                }
            }
        }

        for (int j = 0; j < word.size(); j++) {
            if (in.isKeyPressed(Input.KEY_Z)) {
                if (word.get(j).isCorrectLetter('z') && word.get(j).isChosen()) {
                    x++;
                    if (x - word.size() == 0) {
                        x = 0;
                        word.remove(j);
                        rights++;
                        pickWord();
                    } else {
                        s = s + "z";
                    }
                }
            }
        }
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        guy.draw();
        g.drawString(s, 20, 820); //draw input String
        g.drawString("Rights: " + rights, 370, 820);
        for (EnemyClass a : word) {
            a.draw(g);
        }

    }

    public void pickWord() throws SlickException {
        EnemyClass closest = new EnemyClass(0, -1000);
        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).location() > closest.location()) {
                closest = word.get(i);
            }
        }
        closest.setChosen();
    }

    public int getID() {
        return 0;  //this id will be different for each screen
    }
}
