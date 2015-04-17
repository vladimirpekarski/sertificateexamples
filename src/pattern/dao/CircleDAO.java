package pattern.dao;

public interface CircleDAO {
    void insertCircle(CircleTransfer circle);
    CircleTransfer findCircle(int id);
    void deleteCircle(int id);
}
