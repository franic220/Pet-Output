/**
 * 
 * @author Jephte Francois
 * Assignment 2
 * Intro to Computer Programming 
 * 19S_CST8110_310
 *
 */
public class Pet {
	private String name, species, breed, color;
	private double weight;
	private int ageMonths;
	
	public Pet() {
		
	}
	
	public Pet(String name, String species, String breed, String color, double weight, int ageMonths) {
		this.name = name;
		this.species = species;
		this.breed = breed; 
		this.color = color;
		this.weight = weight;
		this.ageMonths = ageMonths;
	}
	
	public Pet(String species, String breed, String color, double weight, int ageMonths) {
		this.species = species;
		this.breed = breed;
		this.color = color;
		this.weight = weight;
		this.ageMonths = ageMonths;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAgeMonths(int ageMonths) {
		this.ageMonths = ageMonths;
	}
	
	@Override
	public String toString() {
		return "Pet{" + "name=" + name + ", species=" + species + ", breed=" + breed + ", color=" + color + " , weight=" + weight + ", ageMonths=" + ageMonths + "}";
	}

}
