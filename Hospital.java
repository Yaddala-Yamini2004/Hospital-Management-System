import java.util.ArrayList;

public class Hospital {

    private ArrayList<Patient> patients =
            new ArrayList<>();

    private ArrayList<Doctor> doctors =
            new ArrayList<>();

    private ArrayList<Appointment> appointments =
            new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void viewPatients() {

        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    public void viewDoctors() {

        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }

    public Patient findPatient(int id) {

        for (Patient p : patients) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        return null;
    }

    public Doctor findDoctor(int id) {

        for (Doctor d : doctors) {
            if (d.getDoctorId() == id) {
                return d;
            }
        }
        return null;
    }

    public void bookAppointment(
            int appId,
            int patientId,
            int doctorId) {

        Patient p = findPatient(patientId);
        Doctor d = findDoctor(doctorId);

        if (p != null && d != null) {

            appointments.add(
                    new Appointment(appId, p, d));

            System.out.println(
                    "Appointment Booked Successfully");
        } else {
            System.out.println(
                    "Patient or Doctor Not Found");
        }
    }

    public void viewAppointments() {

        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}