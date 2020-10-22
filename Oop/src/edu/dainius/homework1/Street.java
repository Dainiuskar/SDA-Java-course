package edu.dainius.homework1;

public class Street {

    String CityName;
    House[] Houses;

    public Street(House[] houses) {

        Houses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            Houses[i] = houses[i];
        }
    }

    public void info() {

        for (House house : Houses) {
            for (Room room : house.ExtraRooms) {
                for (Furniture furniture : room.Items) {
                    System.out.println(furniture.Name);
                }
            }
        }
    }

}
