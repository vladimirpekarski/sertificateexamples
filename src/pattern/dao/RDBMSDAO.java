package pattern.dao;

public class RDBMSDAO implements CircleDAO {
    @Override
    public void insertCircle(CircleTransfer circle) {
        System.out.println("insert implementation");
    }

    @Override
    public CircleTransfer findCircle(int id) {
        return null;
    }

    @Override
    public void deleteCircle(int id) {

    }
}
