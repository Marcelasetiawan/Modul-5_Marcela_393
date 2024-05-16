import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner MasukkanNama = new Scanner(System.in);

        int i = 1;
        while (true) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String input = MasukkanNama.nextLine();

            if (input.trim().isEmpty()) {
                try {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                } catch (IllegalArgumentException a) {
                    System.out.println(a.getMessage());
                    continue;
                }
            }

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            studentNames.add(input);
            i++;
        }

        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (String name : studentNames) {
            System.out.println("- " + name);
        }
    }
}