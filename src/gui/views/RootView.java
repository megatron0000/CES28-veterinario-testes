package gui.views;


import gui.views.common.ViewBus;
import gui.views.nodes.PSwingFrame;
import xyz.baudelaplace.bmvp.framework.View;
import xyz.baudelaplace.bmvp.framework.binding.Binding;

public class RootView extends View<Binding>{

	@Override
	public void onBindingChanged(Binding newBinding) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInit() {
		ViewBus.FRAME = new PSwingFrame();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
	}

}
