package org.example.four.io.writer;

import org.example.five.CustomFileWriter;
import org.example.one.animal.Animal;
import org.example.three.generic.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class WriterDemo {
    public static void main(String[] args) {

//        WriterExecutor writerExecutor = new WriterExecutor(new ByteWriter());
//        writerExecutor.setWriter(new LineWriter());
//        writerExecutor.setWriter(new CharWriter());

//        Writer pisac = (putanjaDoFajla,sadrzaj) ->{
//            try(FileWriter fileWriter = new FileWriter(putanjaDoFajla)){
//                fileWriter.write(sadrzaj);
//            }catch (IOException e){
//                System.err.println(e.getMessage());
//            }
//        };
//
//       Writer pisac2 = (f,c) -> WriterDemo.piseSadrzajKaFajlu(f,c);
//
//       Writer pisac3 = WriterDemo::piseSadrzajKaFajlu;
//
//
//        CustomFileWriter customFileWriter = new CustomFileWriter();
//        //Lambda poziva instancnu metodu => imeObjekta::imeMetode
//        Writer pisac4 = customFileWriter::writeToFile;

   //     Writer writer = WriterFactory.createWriter(WriterType.BYTE_WRITER);
        Writer writer = WriterType.OBJECT_WRITER.getWriter();
        Person person = new Person("Kristijan","Bantic", LocalDate.now());
        WriterExecutor writerExecutor = new WriterExecutor(writer);
        writerExecutor.executeWriting("novi_fajl.txt","Ja vec sve znam o Lambda/Method referenciranja");
    }

//    private static void piseSadrzajKaFajlu(String filePath, String fileContent){
//        try(FileWriter fileWriter = new FileWriter(filePath)){
//            fileWriter.write(fileContent);
//        }catch (IOException e){
//            System.err.println(e.getMessage());
//        }
//    }
}
