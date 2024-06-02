// Kode untuk mencetak angka dan huruf menggunakan thread dalam Java

// Kelas PrintNumbers yang mengimplementasikan Runnable untuk mencetak angka
class PrintNumbers implements Runnable {
    @Override
    public void run() {
        // Loop untuk mencetak angka 1 sampai 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000); // Jeda 1 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Kelas PrintLetters yang mengimplementasikan Runnable untuk mencetak huruf
class PrintLetters implements Runnable {
    @Override
    public void run() {
        // Loop untuk mencetak huruf A sampai E
        for (char letter = 'A'; letter <= 'E'; letter++) {
            System.out.println("Letter: " + letter);
            try {
                Thread.sleep(1500); // Jeda 1,5 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Kelas utama yang berisi metode main
public class run{
    public static void main(String[] args) {
        // Membuat objek dari kelas PrintNumbers dan PrintLetters
        PrintNumbers printNumbers = new PrintNumbers();
        PrintLetters printLetters = new PrintLetters();

        // Menjalankan metode run() secara langsung pada objek-objek Runnable
        printNumbers.run(); // Menjalankan metode run() untuk mencetak angka
        printLetters.run(); // Menjalankan metode run() untuk mencetak huruf

        // Mencetak pesan setelah kedua metode run() selesai dieksekusi
        System.out.println("Kedua metode run() telah dipanggil.");
    }
}
