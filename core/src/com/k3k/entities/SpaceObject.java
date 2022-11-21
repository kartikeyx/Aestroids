package com.k3k.entities;

import com.badlogic.gdx.Game;


public class SpaceObject {
    //position
    protected float x;
    protected float y = Game.HEIGHT;

    //vector
    protected float dx;
    protected float dy;

    //direction
    protected float radians;

    //speed
    protected float speed;
    protected float rotationSpeed;

    //size
    protected int width;
    protected int height;

    //shape(polygon)
    protected float[] shapex;
    protected float[] shapey;

    protected void wrap(){
        if (x < 0) {
            x = Game.WIDTH;
        }
        if (x > Game.WIDTH) {
            x = 0;
        }
        if (y < 0) {
            y = Game.HEIGHT;
        }
        if (y > Game.HEIGHT) {
            y = 0;
        }
    }
}
