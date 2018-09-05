package gui.views.nodes;

import org.piccolo2d.PCanvas;
import org.piccolo2d.extras.PFrame;
import org.piccolo2d.extras.pswing.PSwingCanvas;

@SuppressWarnings("serial")
public class PSwingFrame extends PFrame {
	
	public PSwingFrame() {
		this(new PSwingCanvas());
	}
	
	public PSwingFrame(final PCanvas aCanvas) {
        super("Veterinário", false, aCanvas);
    }
	

}
