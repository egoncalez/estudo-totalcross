package br.com.starcamp.cda;

import br.com.starcamp.cda.ui.SplashWindow;
import totalcross.sys.Settings;
import totalcross.ui.MainWindow;

public class CDA extends MainWindow {
	
	public CDA() {
		setUIStyle(Settings.Material);
		Settings.uiAdjustmentsBasedOnFontHeight = true;
	}
	
	public void initUI() {
		SplashWindow splashWindow = new SplashWindow();
		splashWindow.popupNonBlocking();
	}

}
