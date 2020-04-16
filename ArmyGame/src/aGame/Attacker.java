package aGame;

public class Attacker {
	private int bombs=10;;
	private String name;
	
	public Attacker(int bombs,String name) {
		this.bombs=bombs;
		this.name=name;
	}

	public boolean bomb(ArmyBase aBase, String target) {
			
		if(aBase.getName().equals(target)) {
			
			float currentHealth = aBase.getHealth();
			currentHealth = currentHealth - 40; 
			aBase.setHealth(currentHealth);
			bombs--;
			return true;
		}
		else
		{
			return false;
		}
		
	}
		
		public void display() {
		System.out.println("Bombs: "+ this.bombs);
		System.out.println("Name: "+this.name);
		}
		
	
}
