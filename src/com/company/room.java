package com.company;
public class room {
    float length;
    float breadth;
    float height;

    public room(float l,float b,float h) {
        length = l;
        breadth = b;
        height = h;
    }
    public float getTotalSurfaceArea() {
        return 2*(length*breadth+breadth*height+length*height);

    }
    public float getPaintableSurfaceArea() {
        return 2*(length * height + breadth * height) + (length + breadth);
    }


    }



