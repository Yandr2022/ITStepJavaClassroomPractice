package itStep.yandr.javaLessons.lesson30.controller;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private  int number;
    private  boolean flag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return number == main.number && flag == main.flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, flag);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 6, 5, 8, 3,};
        while (true) {
            System.out.print("\ninput: ");
            int index = scanner.nextInt();
            if (index <= 0 && index < array.length) {
                System.out.println("your item: " + array[index]);
                break;
            } else {
                System.out.println("Error.Try again...");
            }
        }

    }


//        while (true) {
//            try {
//                System.out.println("input: ");
//                int index = scanner.nextInt();
//                System.out.println("your item: " + array[index]);
//                    break;
//            } catch ( IOException e) {
//                System.out.println("Error.Try again...");
//                throw new StudentDataWrongReadException(e);
//            }catch (RuntimeException e){
//                System.out.println("Wow!!!RuntimeException.Try again...");
//            }
//        }
//    }
}
