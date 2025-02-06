package lk.ijse.employee_manage.repo;
/**
 * Author: vishmee
 * Date: 2/7/25
 * Time: 1:33 AM
 * Description:
 */
import lk.ijse.employee_manage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
