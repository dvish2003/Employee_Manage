package lk.ijse.employee_manage.DTO;

import lombok.*;

/**
 * Author: vishmee
 * Date: 1/10/25
 * Time: 3:01 PM
 * Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class EmployeeDTO {
    private int empID;
    private String empName;
    private String empAddress;
}
