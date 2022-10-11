package itStep.yandr.javaLessons.lesson41;

import java.io.*;

public class BinaryWorker {

    public static void write(String FileName) {
        try (OutputStream stream = new FileOutputStream(FileName)) {
            for (int i = 0; i < 1001; i++) {
                stream.write(i);
            }
            stream.flush();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static String read(String FileName) {
        StringBuilder builder = new StringBuilder();
        try (InputStream stream = new FileInputStream(FileName)) {
            if (stream.available() != 0) {
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
