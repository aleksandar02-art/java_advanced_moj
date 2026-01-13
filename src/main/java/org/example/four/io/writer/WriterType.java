package org.example.four.io.writer;

public enum WriterType {
    //WriuterType BYTE_WRITER = new WriterType("BYTE pisac", " ... ");
    BYTE_WRITER("BYTE pisac","Upisuje fajl byte po byte", new ByteWriter()),
    CHAR_WRITER("CHAR pisac","Upisuje fajl char po char", new CharWriter()),
    LINE_WRITER("LINE pisac","ovaj pisac buferuje celu liniju i upise celu liniju", new LineWriter()),
    OBJECT_WRITER("OBJECT pisac","Ovaj zapise celi objekat odjednom", new ObjectWriter());


    //final ako nema set-era
    private final String name;
    private final String description;
    private final Writer writer;

    WriterType(String name, String description, Writer writer){
        this.name = name;
        this.description = description;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Writer getWriter() {
        return writer;
    }
}
