package edu.dainius.homework1;

public class House {

    String Kitchen;
    String Bedroom;
    String Bathroom;
    Room[] ExtraRooms;

    public House(Room[] rooms) {

        ExtraRooms = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            ExtraRooms[i] = rooms[i];
        }
    }
}
