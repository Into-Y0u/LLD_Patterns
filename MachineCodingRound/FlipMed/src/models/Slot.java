package models;

import java.util.List;

public class Slot {
    public String slotId; // auto generated
    public String outdoorNumber; // will be provide by manager
    public long startTime;
    public long endTime;
    public Doctor bookedByDoctor;
    public List<Patient> bookedByPatient;

    Slot(long startTime, String bookedByDoctor) {

    }

}
