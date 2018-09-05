package gui.presenters.animalSelect;

import java.util.ArrayList;
import java.util.Date;

import core.Animal;
import core.Client;
import gui.events.SessionCreateRequest;
import gui.views.animalSelect.AnimalSelectView;
import gui.views.animalSelect.AnimalSelectViewBinding;
import xyz.baudelaplace.bmvp.framework.OutBinding;
import xyz.baudelaplace.bmvp.framework.Presenter;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class AnimalSelectPresenter extends Presenter<AnimalSelectPresenterBinding> {
	
	private OutBinding<AnimalSelectViewBinding> viewB;

	@Override
	public void onBindingChanged(AnimalSelectPresenterBinding newBinding) {
		if (newBinding == null)
			return;
		this.viewB.set(new AnimalSelectViewBinding(newBinding.clients, (client,animal) -> {
			this.<SessionCreateRequest>push(new SessionCreateRequest() {

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
		this.viewB = declareView(AnimalSelectView.class);
	}

}
