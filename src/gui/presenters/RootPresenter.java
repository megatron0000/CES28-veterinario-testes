package gui.presenters;

import gui.events.SessionCreateRequest;
import gui.views.RootView;
import xyz.baudelaplace.bmvp.framework.Presenter;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class RootPresenter extends Presenter<Binding> {

	@Override
	public void onBindingChanged(Binding newBinding) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInit() {
		registerListener(SessionCreateRequest.class, event -> {
			
		});
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void configure() {
		declareView(RootView.class);
		createChild(AnimalSelectPresenter.class);
	}

}
