public class Character {
	//fields
	public String name, type;
	public int level, exp, hp, attack, magic;
	public boolean elixerUsed;
	
	//default constructor
	public Character(){
		
	}
	
	//getters and setters
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}

	public void setExp(int exp){
		this.exp = exp;
	}
	public int getExp(){
		return exp;
	} 
	
	

	
	
	//Change exp
	public void addExp(int exp){
		this.exp = this.exp + exp;
		//update level
		// this.level = 
	}
	
}
