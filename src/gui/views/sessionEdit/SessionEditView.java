package gui.views.sessionEdit;

import java.awt.geom.AffineTransform;
import java.util.Timer;
import java.util.TimerTask;

import org.piccolo2d.PLayer;

import gui.views.common.ViewBus;
import gui.views.nodes.SessionNode;
import xyz.baudelaplace.bmvp.framework.View;

public class SessionEditView extends View<SessionEditViewBinding> {

	private SessionNode node;

	@Override
	public void onBindingChanged(SessionEditViewBinding newBinding) {
		if (newBinding == null)
			return;

		PLayer layer = ViewBus.FRAME.getCanvas().getLayer();
		ViewBus.FRAME.getCanvas().getCamera().setViewTransform(new AffineTransform());

		node =
				new SessionNode(
						0, 0, newBinding.client, newBinding.animal,
						(button, description) -> {
							button.setText("Salvando... relatório será impresso na linha de comando");
							new Timer().schedule(new TimerTask() {

								@Override
								public void run() {
									newBinding.onSave.accept(description);
									System.out.println("------------------------");
									System.out.println("Salva nova consulta");
									System.out.println("------------------------");
									System.out.println("Cliente: " + newBinding.client.getName());
									System.out.println("------------------------");
									System.out.println("Animal: " + newBinding.animal.getName());
									System.out.println("------------------------");
									System.out.println("Data da consulta: " + newBinding.date.toString());
									System.out.println("------------------------");
									System.out.println("Sintomas e exames: " + description);
								}
							}, 2000);
						});

		layer.addChild(node);
	}

	@Override
	public void onInit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		node.removeFromParent();
	}

}
