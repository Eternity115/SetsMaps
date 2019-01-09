
package Conference;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Conference {
    private String name;
    private String description;
    private Set<Guest> people;
    private ImageIcon image;
    
    public Conference(String n, String d, String img){
        name = n;
        description = d;
        image = new ImageIcon(getClass().getResource(img));
        people = new HashSet();
    }
    
    public boolean signup(Guest g){
       if (people.contains(g)){
           return false;
       }
       else return true;
    }
    
    public boolean remove(Guest g){
        if (people.contains(g)){
           return true;
       }
       else return false;
    }

    Set<Guest> getList() {
        return people;
    }

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    Icon getImage() {
        return image;
    }
    
    public void save(PrintWriter pw, String key){
        Iterator<Guest> it = people.iterator();
        while(it.hasNext()){
            pw.println(key);
            pw.println(it.next());
        }
    }
    
}
