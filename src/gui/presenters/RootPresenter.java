package gui.presenters;

import java.util.ArrayList;

import core.Animal;
import core.Client;
import gui.events.SessionCreateRequest;
import gui.events.SessionSaveRequest;
import gui.presenters.animalSelect.AnimalSelectPresenter;
import gui.presenters.animalSelect.AnimalSelectPresenterBinding;
import gui.presenters.sessionEdit.SessionEditPresenter;
import gui.presenters.sessionEdit.SessionEditPresenterBinding;
import gui.views.RootView;
import xyz.baudelaplace.bmvp.framework.Presenter;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class RootPresenter extends Presenter<Binding> {

	@Override
	public void onBindingChanged(Binding newBinding) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("serial")
	@Override
	public void onInit() {
		registerListener(SessionCreateRequest.class, event -> {
			createChild(SessionEditPresenter.class).set(
					new SessionEditPresenterBinding(event.getClient(), event.getAnimal(), event.getDate()));
		});

		registerListener(SessionSaveRequest.class, event -> {
			createChild(AnimalSelectPresenter.class)
					.set(new AnimalSelectPresenterBinding(new ArrayList<Client>() {
						{
							add(new Client("Pessoa A", "Lugar A"));
							add(new Client("Pessoa B", "Lugar B"));
							add(new Client("Pessoa C", "Lugar C"));
							add(new Client("Pessoa D", "Lugar D"));
							add(new Client("Pessoa E", "Lugar E"));
							forEach(client -> {
								client.addAnimal(new Animal("Totó", "Cachorro", client));
								client.addAnimal(new Animal("Félix", "Gato", client));
							});
						}
					}));
		});
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("serial")
	@Override
	protected void configure() {
		declareView(RootView.class);
		createChild(AnimalSelectPresenter.class)
				.set(new AnimalSelectPresenterBinding(new ArrayList<Client>() {
					{
						add(new Client("Pessoa A", "Lugar A"));
						add(new Client("Pessoa B", "Lugar B"));
						add(new Client("Pessoa C", "Lugar C"));
						add(new Client("Pessoa D", "Lugar D"));
						add(new Client("Pessoa E", "Lugar E"));
						forEach(client -> {
							client.addAnimal(new Animal("Totó " + client.getName().split(" ")[1], "Cachorro", client));
							client.addAnimal(new Animal("Félix " + client.getName().split(" ")[1], "Gato", client));
						});
					}
				}));
		;
	}

}
