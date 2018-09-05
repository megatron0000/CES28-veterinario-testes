package gui.views.sessionEdit;

import java.util.Date;
import java.util.function.Consumer;

import core.Animal;
import core.Client;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class SessionEditViewBinding implements Binding {

	public Client client;
	public Animal animal;
	public Date date;
	public Consumer<String> onSave;

	public SessionEditViewBinding(Client client, Animal animal, Date date, Consumer<String> onSave) {
		this.client = client;
		this.date = date;
		this.animal = animal;
		this.onSave = onSave;
	}

	@Override
	public Object clone() {
		return this;
	}
}
