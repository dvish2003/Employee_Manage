package lk.ijse.employee_manage.dto;
/**
 * Author: vishmee
 * Date: 2/7/25
 * Time: 1:33 AM
 * Description:
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private int empID;
    private String empName;
    private String empAddress;
    private String empMNumber;
}
