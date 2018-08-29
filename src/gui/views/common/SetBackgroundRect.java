package gui.views.common;

import java.awt.Color;
import java.awt.Graphics2D;

import org.piccolo2d.PNode;
import org.piccolo2d.util.PPaintContext;

public class SetBackgroundRect {
	
	private PNode node;
	private Color color;
	
	public SetBackgroundRect(PNode node, Color color) {
		this.node = node;
		this.color = color;
	}
	
	public void set(PPaintContext ctx) {
		Graphics2D g = ctx.getGraphics();
		g.drawRect((int) node.getX(), (int) node.getY(), (int) node.getBounds().width, (int) node.getBounds().height);
		g.setColor(this.color);
		g.fillRect((int) node.getX(), (int) node.getY(), (int) node.getBounds().width, (int) node.getBounds().height);
	}
}
