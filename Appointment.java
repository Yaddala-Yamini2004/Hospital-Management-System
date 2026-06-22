public class Appointment {

    private int appointmentId;
    private Patient patient;
    private Doctor doctor;

    public Appointment(int appointmentId,
                       Patient patient,
                       Doctor doctor) {

        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
    }

    @Override
    public String toString() {

        return "Appointment ID: " + appointmentId +
                ", Patient: " + patient.getName() +
                ", Doctor: " + doctor.getName();
    }
}
