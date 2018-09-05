package gui.views.nodes;

import javax.swing.JTextArea;

import org.piccolo2d.PNode;
import org.piccolo2d.extras.pswing.PSwing;
import org.piccolo2d.extras.pswing.PSwingCanvas;
import org.piccolo2d.nodes.PText;

import gui.views.common.Config;
import gui.views.common.ViewBus;

@SuppressWarnings("serial")
public class SessionNode extends PNode {
	
	public SessionNode(double x, double y) {
		
		
		double labelWidth = 100;
		double textHeight = 100;
		
		PText descriptionLabel = new PText("\n      " + "Sintomas: " + "\n\n");
		descriptionLabel.setConstrainHeightToTextHeight(true);
		descriptionLabel.setConstrainWidthToTextWidth(false);
		descriptionLabel.setFont(Config.DEFAULT_FONT);
		addChild(descriptionLabel);
		descriptionLabel.setBounds(x, y, labelWidth, textHeight);
		
		JTextArea descriptionTA = new JTextArea();
		PSwing descriptionNode = new PSwing(descriptionTA);
		addChild(descriptionNode);
		descriptionNode.setBounds(x + descriptionLabel.getWidth() + 50, y, labelWidth, textHeight);
		
		
	}

}
