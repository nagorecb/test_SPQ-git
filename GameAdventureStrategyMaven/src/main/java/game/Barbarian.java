package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Just created the GUI
public class Barbarian extends Character {
	final Logger logger = LoggerFactory.getLogger(Barbarian.class);
	
	/**
	* Constructor of Barbarian thar receives as argument a WeaponBehaviour.
	*
	* @param w Weapon with which the Barbarian will fight
	*/
	public Barbarian(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		System.out.println("Modified from B");

		logger.info("You are a strong, hulky barbarian!!!.....?");;

		System.out.println("Modified from Aadfasdfdsdfs");
	}
}
