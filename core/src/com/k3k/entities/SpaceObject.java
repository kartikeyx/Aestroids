package com.k3k.entities;

import static com.k3k.main.Asteroids.HEIGHT;
import static com.k3k.main.Asteroids.WIDTH;

public class SpaceObject {
    //position
    protected float x;
    protected float y;

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

    public float getx(){
        return x;
    }
    public float gety(){
        return y;
    }

    protected void wrap(){
        if (x < 0) {
            x = WIDTH;
        }
        if (x > WIDTH) {
            x = 0;
        }
        if (y < 0) {
            y = HEIGHT;
        }
        if (y > HEIGHT) {
            y = 0;
        }
    }
}
