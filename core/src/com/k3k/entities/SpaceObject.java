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

    public float[] getShapex(){
        return shapex;
    }

    public float[] getShapey(){
        return shapey;
    }

    public boolean intersects(SpaceObject other){
        float[] sx = other.getShapex();
        float[] sy = other.getShapey();
        for (int i = 0; i < sx.length; i++){
            if (contains(sx[i], sy[i])){
                return true;
            }
        }
        return false;
    }

    public boolean contains(float x, float y){
        boolean b = false;
        for (int i = 0, j = shapex.length - 1; i < shapex.length; j = i++){
            if ((shapey[i] > y) != (shapey[j] > y) &&
                    (x < (shapex[j] -  shapex[i]) *
                            (y - shapey[i]) / (shapey[j] - shapey[i]) +
                            shapex[i])){
                b = !b;

            }
        }
        return b;
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
