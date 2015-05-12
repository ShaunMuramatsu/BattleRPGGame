
public class Game {
	public static void main (String []args) {
		Character lightning = new Character();
		lightning.setName("lightning");
		lightning.setType("mage");
		lightning.setExp(0);
		//dungeon cleared and now get 10 exps
		lightning.addExp(10);
		System.out.println("Character's name: " + lightning.getName() + "\nCharacter's type: " + lightning.getType());
		System.out.println("Character's exp: " + lightning.getExp());
	}
}
