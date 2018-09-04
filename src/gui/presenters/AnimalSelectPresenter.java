package gui.presenters;

import java.util.ArrayList;
import java.util.Date;

import core.Animal;
import core.Client;
import gui.events.SessionCreateRequest;
import gui.views.animalSelect.AnimalSelectView;
import gui.views.animalSelect.AnimalSelectViewBinding;
import xyz.baudelaplace.bmvp.framework.Presenter;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class AnimalSelectPresenter extends Presenter<Binding> {

	@Override
	public void onBindingChanged(Binding newBinding) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onInit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("serial")
	@Override
	protected void configure() {
		declareView(AnimalSelectView.class).set(new AnimalSelectViewBinding(new ArrayList<Client>() {
			{
				add(new Client("Pessoa A", "Lugar A"));
				add(new Client("Pessoa B", "Lugar B"));
				add(new Client("Pessoa C", "Lugar C"));
				add(new Client("Pessoa D", "Lugar D"));
				add(new Client("Pessoa E", "Lugar E"));
			}
		}, (client,animal) -> {
			push(new SessionCreateRequest() {

				private Date date = new Date();

				@Override
				public Date getDate() {
					return this.date;
				}

				@Override
				public Client getClient() {
					return client;
				}

				@Override
				public Animal getAnimal() {
					return animal;
				}
			});
			scheduleDestruction();
		}));
	}

}
