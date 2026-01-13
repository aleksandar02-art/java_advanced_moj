package org.example.four.io.reader;

public class ReaderFactory {
    public static Reader createReader(ReaderType readerType){

        Reader reader = switch (readerType){
            case BYTE -> new ByteReader();
            case CHAR -> new CharacterReader();
            case LINE -> new LineReader();
            case OBJECT -> new ObjectReader();
        };
        return reader;
    }


//        switch (readerType) {
//            case BYTE:
//                return new ByteReader();
//            case CHAR:
//                return new CharacterReader();
//            case LINE:
//                return new LineReader();
//            case OBJECT:
//                return new ObjectReader();
//            default:
//                throw new IllegalArgumentException("Unknown reader type %s".formatted(readerType.getName()));
//        }
//    }

//    public static Reader createReader(String type){
//        if(type == null || type.isBlank()){
//            throw new IllegalArgumentException("YType cannot be null or empty");
//        }
//        switch (type.toUpperCase()) {
//            case "BYTE":
//                return new ByteReader();
//            case "CHAR":
//                return new CharacterReader();
//            case "LINE":
//                return new LineReader();
//            case "OBJECT":
//                return new ObjectReader();
//            default:
//                throw new IllegalArgumentException("Unknown reader type %s".formatted(type));
//        }
//    }
}
