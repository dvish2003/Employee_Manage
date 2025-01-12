package lk.ijse.employee_manage.repo;

import lk.ijse.Emplyee_Manage.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: vishmee
 * Date: 1/10/25
 * Time: 3:08 PM
 * Description:
 */
public interface EmployeeRepo extends JpaRepository <Employee,Integer>{
}
