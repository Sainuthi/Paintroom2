package com.company;

public class PaintRoom {
    public static void main(String[]args){
        room livingRoom=new room(30,15,9);
        room bedRoom1=new room(15,15,9);
        room bedRoom2=new room(10,11,9);
        room kitchen=new room(9,8,9);
        float totalPaintArea=livingRoom.getPaintableSurfaceArea()+bedRoom1.getPaintableSurfaceArea()+bedRoom2.getPaintableSurfaceArea()+kitchen.getPaintableSurfaceArea();

        System.out.printf("Total Paint Area=%f", totalPaintArea);
    }
}