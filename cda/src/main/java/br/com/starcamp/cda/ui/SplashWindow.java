package br.com.starcamp.cda.ui;

import br.com.starcamp.cda.util.Colors;
import br.com.starcamp.cda.util.Images;
import totalcross.ui.ImageControl;
import totalcross.ui.Window;

public class SplashWindow extends Window {

	public SplashWindow() {
		setBackColor(Colors.BACKCOLOR);
	}
	
	/*
	 * Funciona igual ao initUI da MainWindow
	 */
	@Override
	protected void onPopup() {
		ImageControl imageControl = new ImageControl(Images.imgSplash);
		imageControl.scaleToFit = true;
		imageControl.centerImage = true;
		imageControl.hwScale = true;
		imageControl.strechImage = false;
		add(imageControl, CENTER, CENTER, PARENTSIZE+90, PARENTSIZE+90);
	}
	
}
