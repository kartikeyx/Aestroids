package com.k3k.gamestates;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.k3k.entities.Bullet;
import com.k3k.entities.Player;
import com.k3k.managers.GameKeys;
import com.k3k.managers.GameStateManager;

import java.util.ArrayList;

public class PlayState extends GameState{

    private ShapeRenderer sr;
    private Player player;
    private ArrayList<Bullet> bullets;

    public PlayState(GameStateManager gsm){
        super(gsm);
    }

    @Override
    public void init() {
        sr = new ShapeRenderer();

        bullets = new ArrayList<Bullet>();

        player = new Player(bullets);
    }

    @Override
    public void update(float dt) {
        //get user input
        handleInput();
        //update player
        player.update(dt);
        //update player bullets
        for (int i = 0; i < bullets.size(); i++){
            bullets.get(i).update(dt);
            if (bullets.get(i).shouldRemove()){
                bullets.remove(i);
                i--;
            }
        }
    }

    @Override
    public void draw() {
        //draw player
        player.draw(sr);

        //draw bullets
        for (int i = 0; i < bullets.size(); i++){
            bullets.get(i).draw(sr);
        }
    }

    @Override
    public void handleInput() {
        player.setLeft(GameKeys.isDown(GameKeys.LEFT));
        player.setRight(GameKeys.isDown(GameKeys.RIGHT));
        player.setUp(GameKeys.isDown(GameKeys.UP));
        if (GameKeys.isPressed(GameKeys.SPACE)){
            player.shoot();
        }
    }

    @Override
    public void dispose() {

    }

}
