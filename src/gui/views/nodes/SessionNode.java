package gui.views.nodes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.function.BiConsumer;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicBorders;

import org.piccolo2d.PNode;
import org.piccolo2d.extras.pswing.PSwing;
import org.piccolo2d.nodes.PText;
import org.piccolo2d.util.PPaintContext;

import core.Animal;
import core.Client;
import gui.views.common.Config;
import gui.views.common.SetBackgroundRect;
import gui.views.common.ViewBus;

@SuppressWarnings("serial")
public class SessionNode extends PNode {

	PText descriptionLabel;
	PText clientLabel;
	PText animalLabel;
	PSwing descriptionPSwing;
	BiConsumer<JButton, String> onClickSave;

	public SessionNode(
			double x, double y, Client client, Animal animal, BiConsumer<JButton, String> onClickSave
	) {

		this.onClickSave = onClickSave;

		double width = ViewBus.FRAME.getCanvas().getWidth();
		double height = 200 / 3;

		clientLabel = createField(x, y, width, height, "\nCliente\n\n");

		PText clientName = createField(x, y, width, height, "\n" + client.getName() + "\n\n");

		animalLabel = createField(x, y, width, height, "\nAnimal\n\n");

		PText animalName = createField(x, y, width, height, "\n" + animal.getName() + "\n\n");

		descriptionLabel = createField(x, y, width, height, "\nSintomas e Exames\n\n");

		JTextArea descriptionTA = new JTextArea("\nEscreva os sintomas e exames pedidos\n\n");
		descriptionTA.setBorder(
				new BasicBorders.FieldBorder(Config.BLACK, Config.BLACK, Config.GRAY, Config.GRAY));
		descriptionTA.setLineWrap(true);
		descriptionTA.setBounds(0, 0, (int) width, (int) (3 * height));
		descriptionTA.setDoubleBuffered(false);

		descriptionPSwing = new PSwing(descriptionTA);
		descriptionPSwing.translate(x, y + descriptionLabel.getHeight());

		PNode blankSpace = new PNode();
		blankSpace.setBounds(0, 0, width, 10);

		JButton saveButton = new JButton("Salvar e voltar à tela inicial");
		saveButton.setBounds(0, 0, (int) width, (int) height);
		saveButton.setPreferredSize(new Dimension((int) width, (int) height));
		saveButton.setDoubleBuffered(false);

		PSwing saveButtonPSwing = new PSwing(saveButton);
		saveButtonPSwing.translate(x, y);
		saveButton.addActionListener(action -> {
			onClickSave.accept(saveButton, descriptionTA.getText());
		});

		addChild(clientLabel);
		addChild(clientName);
		addChild(animalLabel);
		addChild(animalName);
		addChild(descriptionLabel);
		addChild(descriptionPSwing);
		addChild(blankSpace);
		addChild(saveButtonPSwing);

	}

	@Override
	protected void paint(PPaintContext arg0) {
		super.paint(arg0);
		new SetBackgroundRect(descriptionLabel, new Color(100 / 255F, 100 / 255F, 100 / 255F, 0.5F))
				.set(arg0);
		new SetBackgroundRect(clientLabel, new Color(100 / 255F, 100 / 255F, 100 / 255F, 0.5F)).set(arg0);
		new SetBackgroundRect(animalLabel, new Color(100 / 255F, 100 / 255F, 100 / 255F, 0.5F)).set(arg0);
		new SetBackgroundRect(descriptionPSwing, new Color(100 / 255F, 100 / 255F, 100 / 255F, 0.5F))
				.set(arg0);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void layoutChildren() {
		final double xOffset = 0;
		double yOffset = 0;

		final java.util.ListIterator<PNode> i = getChildrenIterator();
		while (i.hasNext()) {
			final PNode each = i.next();
			each.setOffset(xOffset, yOffset);
			yOffset += each.getHeight();
		}
	}

	private PText createField(double x, double y, double width, double height, String text) {
		PText field = new PText(text);
		field.setHorizontalAlignment(Component.CENTER_ALIGNMENT);
		field.setConstrainWidthToTextWidth(false);
		field.setConstrainHeightToTextHeight(false);
		field.setFont(Config.DEFAULT_FONT);
		field.setBounds(0, 0, width, height);
		field.translate(x, y);
		return field;
	}

}
