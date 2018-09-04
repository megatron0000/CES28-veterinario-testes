package gui.views.animalSelect;

import java.util.ArrayList;

import core.Client;
import gui.views.common.ViewBus;
import gui.views.nodes.ClientNode;
import xyz.baudelaplace.bmvp.framework.View;

public class AnimalSelectView extends View<AnimalSelectViewBinding> {

	private ArrayList<ClientNode> currentClients = new ArrayList<>();

	@Override
	public void onBindingChanged(AnimalSelectViewBinding newBinding) {
		// TODO Auto-generated method stub
		if (newBinding == null)
			return;

		this.currentClients.forEach(client -> client.removeFromParent());
		this.currentClients = new ArrayList<>();

		int widthMax = (int) Math.floor(Math.sqrt(newBinding.clients.size()));
		int widthCount = 0;
		double x = 0;
		double y = 0;
		for (int i = 0; i < newBinding.clients.size(); i++) {
			Client client = newBinding.clients.get(i);
			ClientNode curr =
					new ClientNode(
							client, x, y, animal -> newBinding.onAnimalSelected.accept(client, animal));
			ViewBus.FRAME.getCanvas().getLayer().addChild(curr);
			this.currentClients.add(curr);
			widthCount++;
			if (widthCount > widthMax) {
				widthCount = 0;
				x = 0;
				y += curr.getHeight() + 50D;
			} else {
				x += curr.getWidth() + 50D;
			}
		}

	}

	@Override
	public void onInit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		this.currentClients.forEach(client -> client.removeFromParent());
	}

}
