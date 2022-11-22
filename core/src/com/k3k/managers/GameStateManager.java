package com.k3k.managers;

import com.k3k.gamestates.GameState;
import com.k3k.gamestates.PlayState;

public class GameStateManager {
    //current gamestate
    private GameState gameState;

    public static final int MENU = 0;
    public static final int PLAY = 22131;

    public GameStateManager(){
        setState(PLAY);
    }

    private void setState(int state){
        if (gameState != null){
            gameState.dispose();
        }

        if (state == MENU){
            //gameState = new MenuState(this);
        }
        if (state == PLAY){
            gameState = new PlayState(this);
        }
    }

    public void update(float dt){
        gameState.update(dt);
    }
    public void draw(){
        gameState.draw();
    }
}
