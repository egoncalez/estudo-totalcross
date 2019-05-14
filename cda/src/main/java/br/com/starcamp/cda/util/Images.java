package br.com.starcamp.cda.util;

import totalcross.io.IOException;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

/**
 * 
 * @author egoncalez
 *
 */
public class Images {
	
	public static Image imgSplash;
	
	static {
		try {
			imgSplash = new Image("images/Starcamp-final-300DPI.png");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ImageException e) {
			e.printStackTrace();
		}
	}
	
}
