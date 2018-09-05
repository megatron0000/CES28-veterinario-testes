package gui.presenters.sessionEdit;

import gui.views.sessionEdit.SessionEditView;
import xyz.baudelaplace.bmvp.framework.Presenter;

public class SessionEditPresenter extends Presenter<SessionEditPresenterBinding> {

	@Override
	public void onBindingChanged(SessionEditPresenterBinding newBinding) {
		if (newBinding == null)
			return;
		
		
		
	}

	@Override
	public void onInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void configure() {
		declareView(SessionEditView.class);
	}

}
