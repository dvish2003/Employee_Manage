package lk.ijse.employee_manage.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Author: vishmee
 * Date: 2/7/25
 * Time: 1:33 AM
 * Description:
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Employee")
public class Employee {
    @Id
    private int empID;
    private String empName;
    private String empAddress;
    private String empMNumber;
}
