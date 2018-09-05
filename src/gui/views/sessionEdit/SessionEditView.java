package gui.views.sessionEdit;

import gui.views.common.ViewBus;
import gui.views.nodes.SessionNode;
import xyz.baudelaplace.bmvp.framework.View;

public class SessionEditView extends View<SessionEditViewBinding>{

	@Override
	public void onBindingChanged(SessionEditViewBinding newBinding) {
//		if (newBinding == null)
//			return;
		
		ViewBus.FRAME.getCanvas().getLayer().addChild(new SessionNode(0, 0));
	}

	@Override
	public void onInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		
	}

}
