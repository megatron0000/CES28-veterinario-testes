package gui.views;

import org.piccolo2d.extras.PFrame;

import gui.views.common.ViewBus;
import xyz.baudelaplace.bmvp.framework.View;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class RootView extends View<Binding>{

	@Override
	public void onBindingChanged(Binding newBinding) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInit() {
		ViewBus.FRAME = new PFrame();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
	}

}
