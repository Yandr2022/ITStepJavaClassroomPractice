package itStep.yandr.javaLessons.lesson41;

public class Main {
    public static void main(String[] args) {
        String FileName = "D://Test//test1.bin";
        String FileName1 = "D://Test//test1.txt";
        BinaryWorker.write(FileName);
        System.out.println(BinaryWorker.read(FileName));
        CharacterWorker.write(FileName1);
        System.out.println(CharacterWorker.read(FileName1));


    }
}
