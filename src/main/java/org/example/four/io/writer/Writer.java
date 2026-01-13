package org.example.four.io.writer;


@FunctionalInterface
public interface Writer {
    void write(String path, String content) throws WriterException;



//    default void print(){
//        System.out.println("Ispis...");
//    }
//
//    public static void nekaStaticMetoda(){
//
//    }
}
