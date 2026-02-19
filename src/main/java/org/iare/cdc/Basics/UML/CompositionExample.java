package org.iare.cdc.Basics.UML;

import java.util.ArrayList;
import java.util.List;

class Room {
    private String className;

    public Room(String name) {
        this.className = name;
    }

    public String getName() {
        return className;
    }
}

class House {
    private List<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Dining Room"));
        rooms.add(new Room("Pooja Room"));
    }

    public void showRooms() {
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
    }
}

public class CompositionExample {
    public static void main(String args[]){
        House house = new House();
        house.showRooms();
    }
}
