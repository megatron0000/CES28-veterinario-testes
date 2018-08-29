package gui.views;

import java.awt.Color;
import java.awt.Component;

import org.piccolo2d.event.PBasicInputEventHandler;
import org.piccolo2d.event.PInputEvent;
import org.piccolo2d.nodes.PText;
import org.piccolo2d.util.PPaintContext;

import core.Animal;
import gui.views.common.Config;
import gui.views.common.SetBackgroundRect;

/**
 * 
 * Represents a rectangle with information on an Animal. Must be subclassed
 * to specify action on click
 * 
 * @author Vitor Arruda
 *
 */
public abstract class AnimalNode extends PText {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Animal animal;
	private Color color = new Color(135/255F ,206/255F , 235/255F);

	AnimalNode(Animal animal, double baseWidth, double baseHeight, double x, double y) {
		super();
		this.animal = animal;
		this.setText("\n" + this.animal.getName() + "\n\n");
		this.setConstrainHeightToTextHeight(true);
		this.setConstrainWidthToTextWidth(false);
		this.setBounds(x, y, baseWidth, baseHeight);
		this.setHorizontalAlignment(Component.CENTER_ALIGNMENT);
		this.setFont(Config.DEFAULT_FONT);

		AnimalNode self = this;
		this.addInputEventListener(new PBasicInputEventHandler() {
			@Override
			public void mouseEntered(PInputEvent event) {
				super.mouseEntered(event);
				self.setHover(true);
			}

			@Override
			public void mouseExited(PInputEvent event) {
				super.mouseExited(event);
				self.setHover(false);
			}
			
			@Override
			public void mouseClicked(PInputEvent event) {
				// TODO Auto-generated method stub
				super.mouseClicked(event);
				self.onClick();
			}
		});
	}
	
	@Override
	protected void paint(PPaintContext ctx) {
		new SetBackgroundRect(this, this.color).set(ctx);
		super.paint(ctx);
	}
	
	private void setHover(boolean isHovering) {
		this.color = isHovering ?  new Color(65/255F ,105/255F , 225/255F) : new Color(135/255F ,206/255F , 235/255F);
		this.repaint();
	}
	
	public abstract void onClick();

}
