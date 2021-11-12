package filez;

import java.io.*;

public class BufferedFile {

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/aaronsonrossita/Desktop/Test/myFile.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        BufferedReader br = new BufferedReader(new FileReader(file));

        bw.write("Hello World");
        bw.append("s\n");
        bw.append("How are you ?");
        bw.close();

        int ch = br.read();
        while (ch != -1){
            System.out.print((char)ch);
            ch = br.read();
        }
        br.close();
    }
}
