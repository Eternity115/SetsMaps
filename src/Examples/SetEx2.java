
package Examples;

import java.util.HashSet;
import java.util.Iterator;


public class SetEx2 {

    
    public static void main(String[] args) {
        HashSet<Pokemon> ball = new HashSet<Pokemon>();
        Pokemon p = new Pokemon("Pikachu", 25);
        ball.add(p);
        //System.out.println(p.hashCode());
        ball.add(new Pokemon("Charmander",4));
        ball.add(new Pokemon("Squirtle",7));
        ball.add(new Pokemon("Butterfree",12));
        ball.add(new Pokemon("Pikachu",25));
        System.out.println(ball);
        System.out.println("Removing " + p);
        ball.remove(p);
        System.out.println("We now have " + ball.size() + "pokemon:");
        
        Iterator it = ball.iterator();
        
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Emptying my set");
        ball.clear();
        System.out.println("We now have " + ball.size() + " pokemon.");
    }
    
}
