/*
 *Aisik Pilote
 *Carpet
 *calculates the price to carpet a room
 */

package carpet;

/**
 *
 * @author aipil3692
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width = 8.5; 
        double length = 6;
        double area = width*length;
        double price = (area*19.95)*100/100;
        System.out.println("The price to carpet the room is "+price);
    }
    
}
