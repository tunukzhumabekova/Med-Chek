package AllPackages.DAO.DAOInterface;


public interface DaoGenericInterface {


    <T> void add(Long  hospitalId, T t);



    <t> void removeById(Long id, t t);



}
