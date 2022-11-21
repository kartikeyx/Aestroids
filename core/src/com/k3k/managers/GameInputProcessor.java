package com.k3k.managers;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

public class GameInputProcessor extends InputAdapter {

    @Override
    public boolean keyUp(int k) {
        if (k == Input.Keys.UP){
            GameKeys.setKeys(GameKeys.UP, false);
        }
        if (k == Input.Keys.DOWN){
            GameKeys.setKeys(GameKeys.DOWN, false);
        }
        if (k == Input.Keys.LEFT){
            GameKeys.setKeys(GameKeys.LEFT, false);
        }
        if (k == Input.Keys.RIGHT){
            GameKeys.setKeys(GameKeys.RIGHT, false);
        }
        if (k == Input.Keys.ENTER){
            GameKeys.setKeys(GameKeys.ENTER, false);
        }
        if (k == Input.Keys.ESCAPE){
            GameKeys.setKeys(GameKeys.ESCAPE, false);
        }
        if (k == Input.Keys.SPACE){
            GameKeys.setKeys(GameKeys.SPACE, false);
        }
        if (k == Input.Keys.SHIFT_LEFT || k == Input.Keys.SHIFT_RIGHT){
            GameKeys.setKeys(GameKeys.SHIFT, false);
        }
        return true;
    }
    public boolean keyDown(int k){
        if (k == Input.Keys.UP){
            GameKeys.setKeys(GameKeys.UP, true);
        }
        if (k == Input.Keys.DOWN){
            GameKeys.setKeys(GameKeys.DOWN, true);
        }
        if (k == Input.Keys.LEFT){
            GameKeys.setKeys(GameKeys.LEFT, true);
        }
        if (k == Input.Keys.RIGHT){
            GameKeys.setKeys(GameKeys.RIGHT, true);
        }
        if (k == Input.Keys.ENTER){
            GameKeys.setKeys(GameKeys.ENTER, true);
        }
        if (k == Input.Keys.ESCAPE){
            GameKeys.setKeys(GameKeys.ESCAPE, true);
        }
        if (k == Input.Keys.SPACE){
            GameKeys.setKeys(GameKeys.SPACE, true);
        }
        if (k == Input.Keys.SHIFT_LEFT || k == Input.Keys.SHIFT_RIGHT){
            GameKeys.setKeys(GameKeys.SHIFT, true);
        }


        return true;
    }
}
