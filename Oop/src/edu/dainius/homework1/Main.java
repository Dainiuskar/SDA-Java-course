package edu.dainius.homework1;

public class Main {
    public static void main(String[] args) {

        Furniture furniture = new Furniture("Item 1");
        Furniture furniture1 = new Furniture("Item 2");
        Furniture furniture2 = new Furniture("Item 3");
        Furniture furniture3 = new Furniture("Item 4");

        Furniture[] furnitureSet1 = {furniture, furniture1, furniture2, furniture3};
        Furniture[] furnitureSet2 = {furniture, furniture3};
        Furniture[] furnitureSet3 = {furniture1, furniture2};


        Room extraRoom = new Room(furnitureSet1);
        Room extraRoom1 = new Room(furnitureSet2);
        Room extraRoom2 = new Room(furnitureSet3);

        Room[] roomSet = {extraRoom, extraRoom1, extraRoom2};
        Room[] roomSet1 = {extraRoom, extraRoom1};

        House house = new House(roomSet);
        House house1 = new House(roomSet1);

        House[] houseSet = {house, house1};

        Street street = new Street(houseSet);
        street.info();


    }
}
