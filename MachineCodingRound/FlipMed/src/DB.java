import java.util.HashMap;
import java.util.Hashtable;

import models.Doctor;

public class DB {
    public class DoctorDB {
        Hashtable<String, Doctor> doctorRegistry = new Hashtable();

        public boolean addDoctor(Doctor doctor) {
            if (doctor != null) {
                return null != doctorRegistry.put(doctor.doctorId, doctor);
            }
            return false;
        }

        public Doctor getDoctor(String doctorId) {
            return doctorRegistry.get(doctorId);
        }

        public boolean deleteDoctor(String doctorId) {
            return null != doctorRegistry.remove(doctorId);
        }

    }
}
