package edu.dainius.homework1;

public class Room {

    Float Length;
    Float Width;
    Furniture[] Items;


    public Room(Furniture[] items) {

        Items = new Furniture[items.length];
        for (int i = 0; i < items.length; i++) {
            Items[i] = items[i];
        }
    }
}
