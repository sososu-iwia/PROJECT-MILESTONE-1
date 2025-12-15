import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Creating Institutions 2\n");
        Institution aitu = new Institution(
                "AITU (Astana IT University)",
                "Astana, Kazakhstan",
                2019,
                "IT University",
                "Modern IT university focused on software engineering and digital technologies. Partners with leading tech companies.",
                3.6
        );
        Institution alFarabi = new Institution(
                "Al-Farabi Kazakh National University",
                "Almaty, Kazakhstan",
                1934,
                "National University",
                "The oldest and most prestigious university in Kazakhstan. Named after the great philosopher Al-Farabi. Offers diverse academic programs.",
                3.7
        );
        Institution sdu = new Institution(
                "SDU (Suleyman Demirel University)",
                "Kaskelen, Almaty Region",
                1996,
                "Private University",
                "International university founded with support from Turkey. Known for quality education and international programs.",
                3.5
        );
        Institution gpu = new Institution(
                "Gumilyov Eurasian National University",
                "Astana, Kazakhstan",
                1996,
                "National University",
                "Named after Lev Gumilyov. One of the leading universities in Astana, strong in humanities and social sciences.",
                3.4
        );
        System.out.println(" Creating Teachers \n");
        Teacher teacher1 = new Teacher("Samat Bekov", 201, "Programming", 12);
        Teacher teacher2 = new Teacher("Aigul Zhanatova", 202, "Algorithms", 8);
        Teacher teacher3 = new Teacher("Murat Kuanyshev", 203, "Data Structures", 15);
        System.out.println("INSTITUTIONS INFORMATION \n");
        aitu.displayInfo();
        System.out.println("\n-----------------------------------------\n");
        alFarabi.displayInfo();
        System.out.println("\n-----------------------------------------\n");
        sdu.displayInfo();
        System.out.println("\n-----------------------------------------\n");
        gpu.displayInfo();
        System.out.println("\n\n TEACHERS INFORMATION \n");
        teacher1.displayInfo();
        System.out.println("Senior Teacher: " + teacher1.isSenior());
        teacher1.teach();
        System.out.println("\n-----------------------------------------\n");
        teacher2.displayInfo();
        System.out.println("Senior Teacher: " + teacher2.isSenior());
        teacher2.teach();
        System.out.println("\n-----------------------------------------\n");
        teacher3.displayInfo();
        System.out.println("Senior Teacher: " + teacher3.isSenior());
        teacher3.teach();
        System.out.println("\n\n COMPARISONS ");
        System.out.println("Are AITU and Al-Farabi the same? " + aitu.equals(alFarabi));
        System.out.println("Are teacher1 and teacher2 the same? " + teacher1.equals(teacher2));
        System.out.println("\n\nADD YOURSELF AS A TEACHER ");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your employee ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter subject you teach: ");
        String userSubject = scanner.nextLine();
        System.out.print("Enter years of experience: ");
        int userExp = scanner.nextInt();
        scanner.nextLine();
        Teacher userTeacher = new Teacher(userName, userId, userSubject, userExp);
        System.out.println("\nYour Teacher Profile ");
        userTeacher.displayInfo();
        System.out.println("Senior Teacher: " + userTeacher.isSenior());
        userTeacher.teach();
        System.out.println("\n\n COMPARISON WITH EXISTING TEACHERS");
        System.out.println("Are you the same as teacher1? " + userTeacher.equals(teacher1));
        System.out.println("Are you the same as teacher2? " + userTeacher.equals(teacher2));
        scanner.close();
        System.out.println("\n\nProgram finished successfully!");
    }
}