package org.example.four.io;

public enum ReaderType {
    BYTE("Byte Reader", "Cita byte po byte"),
    CHAR("Char Reader", "Cita char po char"),
    LINE("Line Reader", "Cita line po line"),
    OBJECT("Object Reader","Cita odjednom celi objekat");

    private  String name;
    private String description;

    private ReaderType(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
