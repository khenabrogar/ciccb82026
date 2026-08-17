import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QRAttendanceSystem {
    // Database: Registered Students (QR Data → Student Name)
    private static final Map<String, String> STUDENTS = new HashMap<>();
    private static final String LOG_FILE = "AttendanceLog.txt";
    private static final DateTimeFormatter TIME_FORMAT = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd | HH:mm:ss");

    static {
        // Register students (QR Code content = Student ID)
        STUDENTS.put("STU-001", "Juan Dela Cruz");
        STUDENTS.put("STU-002", "Maria Santos");
        STUDENTS.put("STU-003", "Jose Reyes");
        STUDENTS.put("STU-004", "Ana Garcia");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("     📱 QR CODE ATTENDANCE SYSTEM       ");
        System.out.println("========================================");
        System.out.println("Scan QR Code or type Student ID below.\n");

        while (true) {
            System.out.print("🔍 Scan QR Code (or type 'q' to quit): ");
            String qrData = scanner.nextLine().trim();

            // Exit condition
            if (qrData.equalsIgnoreCase("q")) {
                System.out.println("\n✅ Attendance saved to: " + LOG_FILE);
                System.out.println("Program ended.");
                break;
            }

            // Process scanned QR
            processScan(qrData);
        }
        scanner.close();
    }

    private static void processScan(String qrData) {
        String studentName = STUDENTS.get(qrData);
        String timeStamp = LocalDateTime.now().format(TIME_FORMAT);

        if (studentName != null) {
            String logEntry = String.format("[%s] | ID: %s | Name: %s | ✅ PRESENT",
                timeStamp, qrData, studentName);
            
            System.out.println("\n✅ ATTENDANCE RECORDED");
            System.out.println("   Student: " + studentName);
            System.out.println("   Time:    " + timeStamp.split("\\|")[1].trim());
            
            saveToFile(logEntry);
        } else {
            String logEntry = String.format("[%s] | ID: %s | ❌ UNKNOWN STUDENT",
                timeStamp, qrData);
            
            System.out.println("\n❌ INVALID QR CODE — Student not registered!");
            saveToFile(logEntry);
        }
    }

    private static void saveToFile(String entry) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(entry + "\n");
        } catch (IOException e) {
            System.out.println("⚠️ Error saving log: " + e.getMessage());
        }
    }
}