
package Examples;

import java.util.HashSet;


public class SetEx1 {

    
    public static void main(String[] args) {
       HashSet<String> ball = new HashSet<String>(); 
       
       ball.add("Pikachu");
       System.out.println("Pikachu: " + "Pikachu".hashCode());
       ball.add("Butterfree");
       System.out.println("Butterfree: " + "Butterfree".hashCode());
       ball.add("Squirtle");
       System.out.println("Squirtle: " + "Squirtle".hashCode());
       ball.add("Charmander");
       System.out.println("Charmander: " + "Charmander".hashCode());
       
       ball.add("Pikachu");
       
        System.out.println(ball);
    }
}
