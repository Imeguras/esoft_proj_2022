package org.ipleiria.com.aux;

import javax.swing.JFrame;

public abstract class Janela {
	public JFrame frame;
	public abstract void updateFrame();
	public JFrame getFrame() {
		updateFrame();
		return frame;
	}
}
