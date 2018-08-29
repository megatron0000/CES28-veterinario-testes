package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
	private String name;
	private String address;
	private ArrayList<Animal> animals;
	
	public Client(String name, String address) {
		this.name = name;
		this.address = address;
		this.animals = new ArrayList<Animal>();
		this.animals.add(new Animal("Totó", "Cachorro", this));
		this.animals.add(new Animal("Felix", "Gato", this));
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public ArrayList<Animal> getAnimals(){
		return this.animals;
	}
}
