package lk.ijse.employee_manage.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Author: vishmee
 * Date: 1/10/25
 * Time: 11:52 PM
 * Description:
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseDTO {
    private String responseCode;
    private String responseMessage;
    private Object content;
}
