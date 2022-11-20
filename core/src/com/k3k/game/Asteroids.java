package com.k3k.game;

import cam.k3k.managers.GameInputProcessor;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Asteroids implements ApplicationListener {
	public static int WIDTH;
	public static int HEIGHT;

	public static OrthographicCamera cam;
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		cam = new OrthographicCamera(WIDTH, HEIGHT);
		cam.translate(WIDTH/2, HEIGHT/2);
		cam.update();

		Gdx.input.setInputProcessor(
				new GameInputProcessor()
		);
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0,0,0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

//		if (Gdx.input.isKeyPressed(Input.Keys.SPACE)){
//			System.out.println("SPACE");
//		}
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
