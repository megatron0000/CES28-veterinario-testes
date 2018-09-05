package gui.presenters.animalSelect;

import java.util.ArrayList;

import core.Client;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class AnimalSelectPresenterBinding implements Binding {
	public ArrayList<Client> clients;
	
	public AnimalSelectPresenterBinding(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public Object clone() {
		return this;
	}

}
