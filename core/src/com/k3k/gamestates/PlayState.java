package com.k3k.gamestates;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.k3k.entities.Player;
import com.k3k.managers.GameStateManager;

public class PlayState extends GameState{

    private ShapeRenderer sr;
    private Player player;

    public PlayState(GameStateManager gsm){
        super(gsm);
    }

    @Override
    public void init() {
        sr = new ShapeRenderer();
        player = new Player();
    }

    @Override
    public void update(float dt) {
        player.update(dt);
    }

    @Override
    public void draw() {
        player.draw(sr);
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void dispose() {

    }

}
