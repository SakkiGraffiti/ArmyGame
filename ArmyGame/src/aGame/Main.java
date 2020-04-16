package aGame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArmyBase Jacksonville = new ArmyBase(100,"Jackville");
		ArmyBase Smallville = new ArmyBase(100,"Sville");
		Attacker Tack = new Attacker(10,"missle");
		
		Jacksonville.display();
		Smallville.display();
		Tack.display();
		System.out.println();
	
		Tack.bomb(Jacksonville,"Jackville");
		Jacksonville.display();
		System.out.println();
		
		Tack.bomb(Smallville,"Sville");
		Smallville.display();
		System.out.println();
		
		Tack.display();
	}

}
