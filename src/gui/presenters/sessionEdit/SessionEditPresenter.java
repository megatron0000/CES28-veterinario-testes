package gui.presenters.sessionEdit;

import java.time.ZoneId;

import core.Session;
import gui.events.SessionSaveRequest;
import gui.views.sessionEdit.SessionEditView;
import gui.views.sessionEdit.SessionEditViewBinding;
import xyz.baudelaplace.bmvp.framework.OutBinding;
import xyz.baudelaplace.bmvp.framework.Presenter;

public class SessionEditPresenter extends Presenter<SessionEditPresenterBinding> {

	private OutBinding<SessionEditViewBinding> viewB;

	@Override
	public void onBindingChanged(SessionEditPresenterBinding newBinding) {
		if (newBinding == null)
			return;

		viewB.set(
				new SessionEditViewBinding(
						newBinding.client, newBinding.animal, newBinding.date, description -> {
							final Session newSession =
									new Session(
											newBinding.date
													.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
											newBinding.client, "none", description, newBinding.animal);

							push(new SessionSaveRequest() {
								@Override
								public Session getSession() {
									return newSession;
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

	@Override
	protected void configure() {
		viewB = declareView(SessionEditView.class);
	}

}
