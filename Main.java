import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital();

        while (true) {

            System.out.println("\n===== HOSPITAL MANAGEMENT =====");

            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");3
            git
            System.out.println("4. View Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Patient ID: ");
                    int pid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    hospital.addPatient(
                            new Patient(pid,
                                    pname,
                                    age));

                    break;

                case 2:
                    hospital.viewPatients();
                    break;

                case 3:

                    System.out.print("Doctor ID: ");
                    int did = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Doctor Name: ");
                    String dname = sc.nextLine();

                    System.out.print("Specialization: ");
                    String spec = sc.nextLine();

                    hospital.addDoctor(
                            new Doctor(did,
                                    dname,
                                    spec));

                    break;

                case 4:
                    hospital.viewDoctors();
                    break;

                case 5:

                    System.out.print("Appointment ID: ");
                    int aid = sc.nextInt();

                    System.out.print("Patient ID: ");
                    int patientId = sc.nextInt();

                    System.out.print("Doctor ID: ");
                    int doctorId = sc.nextInt();

                    hospital.bookAppointment(
                            aid,
                            patientId,
                            doctorId);

                    break;

                case 6:
                    hospital.viewAppointments();
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}