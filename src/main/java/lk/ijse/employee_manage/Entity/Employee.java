package lk.ijse.employee_manage.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: vishmee
 * Date: 1/10/25
 * Time: 2:56 PM
 * Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;
    private String empName;
    private String empAddress;
}
