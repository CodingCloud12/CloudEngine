package me.XI_DEMO_IX.engine.game;

import me.XI_DEMO_IX.engine.AbstractGame;
import me.XI_DEMO_IX.engine.GameContainer;
import me.XI_DEMO_IX.engine.Renderer;
import me.XI_DEMO_IX.engine.audio.SoundClip;
import me.XI_DEMO_IX.engine.gfx.ImageTile;

public class GameManager extends AbstractGame{
	
	private ImageTile image;
	private SoundClip clip;
	
	public GameManager() {
		image = new ImageTile("/test.png", 16, 16);
		//clip = new SoundClip("/audio/FILE_NAME");
	}

	@Override
	public void update(GameContainer gc, float dt) {
		temp += dt * 20;
		
		if(temp > 4) {
			temp = 0;
		}
	}
	
	float temp = 0;

	@Override
	public void render(GameContainer gc, Renderer r) {
		r.drawFillRect(10, 10, 64, 32, 0xffffccff);
	}
	
	public static void main(String args[]) {
		GameContainer gc = new GameContainer(new GameManager());
		System.out.println("Starting...");
		gc.start();
	}

}





















