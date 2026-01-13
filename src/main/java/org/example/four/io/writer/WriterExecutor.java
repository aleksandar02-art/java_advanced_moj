package org.example.four.io.writer;

public class WriterExecutor {

    private Writer writer;

    public WriterExecutor(Writer writer){
        this.writer = writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void executeWriting(String path, String content){
        try{
            writer.write(path,content);
        }catch (WriterException e){
            System.err.println(e.getMessage());
        }
    }
}
