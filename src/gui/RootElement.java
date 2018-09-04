package gui;

import java.util.concurrent.ExecutionException;

import javax.swing.SwingUtilities;

import gui.presenters.RootPresenter;
import xyz.baudelaplace.bmvp.framework.BMVP;
import xyz.baudelaplace.bmvp.framework.Presenter;
import xyz.baudelaplace.bmvp.framework.views.ViewAdapter;

public class RootElement extends BMVP {

	RootElement(Class<? extends Presenter<?>> rootPresenterClass, ViewAdapter adapter) {
		super(rootPresenterClass, adapter);
	}

	@Override
	public void configureBindings() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		new RootElement(RootPresenter.class, new ViewAdapter() {

			@Override
			public void invoke(Runnable task) {
				SwingUtilities.invokeLater(task);
			}

		}).start().exceptionally(exception -> {
			exception.printStackTrace();
			return null;
		});
	}

}
