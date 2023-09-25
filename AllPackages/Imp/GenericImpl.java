package AllPackages.Imp;

import AllPackages.DataBase1.DataBase;
import AllPackages.Model.Doctor;
import AllPackages.Model.Hospital;
import AllPackages.ServiceInterface.GenericInterface;

import java.util.List;

public class GenericImpl implements GenericInterface {
    private DataBase dataBase;


    public GenericImpl(List<Doctor> doctors1, List<Doctor> doctors2) {

    }


    public GenericImpl(List<Hospital> hospitals) {


    }

    @Override
    public String add(Long hospitalId, Object o) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public String updateById(Long id, Object o) {
        return null;
    }
}
