package itStep.yandr.javaLessons.lesson41;

import java.io.*;

public class CharacterWorker {

    public static void write(String FileName) {

        try (Writer stream = new FileWriter(FileName)) {
            for (int i = 0; i < 1000; i++) {
                stream.write(i);
            }
            stream.flush();
        } catch (IOException e) {
            System.err.println(e);
        }

    }

    public static String read(String FileName) {
        StringBuilder builder = new StringBuilder();

        try (Reader stream = new FileReader(FileName)) {
            if (stream.ready()) {
                int temp;
                while ((temp = stream.read()) != -1) {
                    builder.append(temp).append(" ");
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        return builder + "";
    }
}


