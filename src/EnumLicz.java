import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EnumLicz {

    public static void main(String[] args) throws IOException {

        float[] tab =new float[7];
        Scanner input = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("test1.txt");
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        System.out.println("Podaj ile liczb chcesz wprowadzić: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = input.nextInt();
            bfw.newLine();
            bfw.write(tab[i]+"");
        }

        bfw.close();


    }
}
