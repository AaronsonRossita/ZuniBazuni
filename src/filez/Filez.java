package filez;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filez {

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/aaronsonrossita/Desktop/Test/myFile.txt");

//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//        System.out.println("is there a file = " + file.exists());

        FileWriter fw = new FileWriter(file);
        FileReader fr = new FileReader(file);

//        if(file.exists()){
//            System.out.println("can we write in it = " + file.canWrite());
//            System.out.println("can we read it = " + file.canRead());
//            System.out.println("is it a directory = " + file.isDirectory());
//        }

        fw.write("Hello World");
        fw.append("s\n");
        fw.append("How are you ?");
        fw.close();

        int ch = fr.read();
        while (ch != -1){
            System.out.print((char)ch);
            ch = fr.read();
        }
        fr.close();
    }

}
