
package KeyboardHitman;

import java.util.Random;

public class test {

    public static void main(String[] args) {
        String[]arr = {"Man", "yett", "crazy"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
         
        System.out.println("Random String selected: " + arr[select]);
        
        
    }
    
}
