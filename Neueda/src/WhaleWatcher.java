import java.util.ArrayList;
import java.util.List;


public class WhaleWatcher {

	public static void main(String[] args) {
		
		//Objets:
		Whale rightWhale = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale blueWhale = new Whale ("Blue", "Pacific", 2001, 23, 16);
		Whale spermWhale = new Whale ("Sperm", "Atlactic", 1900, 20, 40);
		Whale humpbackWhale = new Whale ("Humpback", "Antarctic", 919, 13, 13);
		
		
		
		//adding objets to an ArrayList
		ArrayList<Whale> allwhales = new ArrayList<Whale>() {{
			add(rightWhale);
			add(blueWhale);
			add(spermWhale);
			add(humpbackWhale);
		}};
		
		System.out.println("Using for loop");
		System.out.println("--------------");
		for (int i = 0; i < 4; i++) {
			System.out.println(Animal.class);
		}
		
		
	     
		
	
		
	
		
	}

}
