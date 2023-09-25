package AllPackages.DAO.DAOInterface;

import AllPackages.Model.Patient;

import java.util.Map;

public interface DaoPatientInterface {
    String addPatientsToHospital(Long id, Patient patient);

    Patient getPatientById(Long id);

    Map<Integer, Patient> getPatientByAge(int age);
}
