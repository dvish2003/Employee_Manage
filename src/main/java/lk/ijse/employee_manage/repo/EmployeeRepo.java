package lk.ijse.employee_manage.repo;

import lk.ijse.employee_manage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
