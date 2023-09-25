package AllPackages.DAO.DAOImpl;

import AllPackages.DAO.DAOInterface.DaoGenericInterface;

import java.util.List;

public class DaoGenericImpl<T> implements DaoGenericInterface {


    public DaoGenericImpl(List<T> hospitals) {
    }

    @Override
    public <t> void add(Long hospitalId, t t) {
        System.out.println(t);
    }

    @Override
    public <t> void removeById(Long id, t t) {
        System.out.println(t);
    }


}
