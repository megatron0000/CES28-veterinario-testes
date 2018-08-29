package gui.views;

import java.awt.Color;
import java.util.ArrayList;

import org.piccolo2d.PNode;
import org.piccolo2d.nodes.PText;
import org.piccolo2d.util.PPaintContext;

import core.Animal;
import core.Client;
import gui.views.common.Config;
import gui.views.common.SetBackgroundRect;

public class ClientNode extends PNode {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Client client;
	
	public ClientNode(Client client, double baseX, double baseY) {
		super();
		this.client = client;
		ArrayList<Animal> animals = client.getAnimals();
		double height = 200 + 100 * animals.size(); // title + space + animals spaced
		double width = defaultWidth();
		this.setBounds(baseX, baseY, width, height);
		PText title = new PText("\n      " + this.client.getName() + "\n\n");
		title.setConstrainHeightToTextHeight(true);
		title.setConstrainWidthToTextWidth(false);
		title.setFont(Config.DEFAULT_FONT);
		this.addChild(title);
		title.setBounds(baseX, baseY, width, 200);
		for (int i = 0; i < animals.size(); i++) {
			Animal animal = animals.get(i);
			this.addChild(new AnimalNode(animal, 200, 60,  baseX + 50, baseY + 100 + 100*i + 20) {
				
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void onClick() {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
	}
	
	public double defaultWidth() {
		return 300;
	}
	
	@Override
	protected void paint(PPaintContext ctx) {
		new SetBackgroundRect(this, new Color(220/255F, 220/255F, 220/255F, 0.5F)).set(ctx);
		new SetBackgroundRect(this.getChild(0), new Color(192/255F, 192/255F, 192/255F, 0.2F)).set(ctx);
		super.paint(ctx);
	}
	
}
