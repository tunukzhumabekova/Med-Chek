package AllPackages.DAO.DAOImpl;

import AllPackages.DAO.DAOInterface.DaoPatientInterface;
import AllPackages.DataBase1.DataBase;
import AllPackages.Model.Hospital;
import AllPackages.Model.Patient;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DaoPatientImpl implements DaoPatientInterface {
    private final DataBase dataBase;

    public DaoPatientImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addPatientsToHospital(Long id, Patient patients) {
        Optional<Hospital> optionalHospital = dataBase.hospitals().stream()
                .filter(hospital -> hospital.getId() == id)
                .findFirst();
        if (optionalHospital.isPresent()) {
            Hospital hospital = optionalHospital.get();
            hospital.getPatients().add(patients);
            return "Patients added to hospital successfully.";
        } else {
            return "Hospital not found with ID: " + id;
        }
    }


    @Override
    public Patient getPatientById(Long id) {
        Optional<Patient> first = dataBase.hospitals().stream().flatMap(hospital -> hospital.getPatients().stream()).filter(patient -> patient.getId() == id).findFirst();
        return first.orElseThrow(RuntimeException::new);
    }

    @Override
    public Map<Integer, Patient> getPatientByAge(int age) {
        Map<Integer, Patient> patientsByAge = new HashMap<>();

        dataBase.hospitals().stream().flatMap(n -> n.getPatients().stream()
                        .filter(patient -> patient.getAge() == age))
                .forEach(patient -> patientsByAge.put((int) patient.getId(), patient));

        return patientsByAge;
    }

}
