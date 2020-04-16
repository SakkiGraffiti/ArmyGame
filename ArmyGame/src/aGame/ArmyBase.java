package aGame;

public class ArmyBase {
	private float health;
	private String name;
	
	public ArmyBase () {
		this.health=100.0F;
		this.name="Ira";
	}
	
	public ArmyBase(float health, String name) {
		this.health=health;
		this.name=name;
	}

	public float getHealth() {
		return health;
	}

	public void setHealth(float health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Health: "+ health);
	}
	
	}
