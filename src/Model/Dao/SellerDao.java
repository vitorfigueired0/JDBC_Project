package Model.Dao;
import Model.entities.Department;
import java.util.List;

public interface SellerDao {
    public void insert(Department obj);
    public void update(Department obj);
    public void deleteById(Integer ID);
    public Department findByID(Integer ID);
    public List<Department> findAll();
}
