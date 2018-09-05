package gui.presenters.sessionEdit;

import java.util.Date;

import core.Animal;
import core.Client;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class SessionEditPresenterBinding implements Binding {
	
	public Client client;
	public Animal animal;
	public Date date;
	
	public SessionEditPresenterBinding(Client client, Animal animal, Date date) {
		this.client = client;
		this.date = date;
		this.animal = animal;
	}
	
	public Object clone() {
		return this;
	}
}
