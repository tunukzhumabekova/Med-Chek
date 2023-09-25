package AllPackages.Imp;

import AllPackages.DAO.DAOImpl.DaoHospitalImpl;
import AllPackages.DataBase1.DataBase;
import AllPackages.Model.Hospital;
import AllPackages.Model.Patient;
import AllPackages.ServiceInterface.HospitalInterface;

import java.util.List;
import java.util.Map;

public class HospitalImpl implements HospitalInterface {
    private final DataBase dataBase;
    public DaoHospitalImpl daoHospital;


    public HospitalImpl(DataBase dataBase, DaoHospitalImpl daoHospital) {
        this.dataBase = dataBase;
        this.daoHospital = daoHospital;
    }



    @Override
    public String addHospital(Hospital hospital) {
        return daoHospital.addHospital(hospital);
    }

    @Override
    public Hospital findHospitalById(Long id) {
        return daoHospital.findHospitalById(id);
    }

    @Override
    public List<Hospital> getAllHospital() {
        return daoHospital.getAllHospital();
    }

    @Override
    public List<Patient> getAllPatientFromHospital(Long id) {
        return daoHospital.getAllPatientFromHospital(id);
    }

    @Override
    public boolean deleteHospitalById(Long id) {
        return daoHospital.deleteHospitalById(id);
    }

    @Override
    public Map<String, Hospital> getAllHospitalByAddress(String address) {
        return daoHospital.getAllHospitalByAddress(address);
    }

    public DataBase getDataBase() {
        return dataBase;
    }
}
