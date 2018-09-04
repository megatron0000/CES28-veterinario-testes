package gui.views.animalSelect;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import core.Animal;
import core.Client;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class AnimalSelectViewBinding implements Binding {
	public ArrayList<Client> clients;
	public BiConsumer<Client, Animal> onAnimalSelected;
	
	public AnimalSelectViewBinding(ArrayList<Client> clients, BiConsumer<Client, Animal> onAnimalSelected) {
		this.clients = clients;
		this.onAnimalSelected = onAnimalSelected;
	}

	@Override
	public Object clone() {
		return this;
	}
	
	
}
