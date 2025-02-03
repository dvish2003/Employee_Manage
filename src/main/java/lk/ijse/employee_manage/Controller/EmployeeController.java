package lk.ijse.employee_manage.Controller;


import lk.ijse.employee_manage.DTO.EmployeeDTO;
import lk.ijse.employee_manage.DTO.ResponseDTO;
import lk.ijse.employee_manage.Service.EmployeeService;
import lk.ijse.employee_manage.Util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * Author: vishmee
 * Date: 1/10/25
 * Time: 4:53 PM
 * Description:
 */
@CrossOrigin   //me anotation ek use karanne same port eke project run krddi ex ; project_1 port 8080  /project_2 port 8080
@RestController
@RequestMapping("api/v1/employee")
@Service
public class EmployeeController {

     @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ResponseDTO responseDTO; // Add @Autowired here

    @PostMapping(value = "/saveEmployee")
    public ResponseEntity saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        try {
            String resp = java.lang.String.valueOf(employeeService.saveEmployee(employeeDTO));
            if (resp.equals("O3")) {
                responseDTO.setResponseCode(VarList.RSP_SUCCESS);
                responseDTO.setResponseMessage("Success");
                responseDTO.setContent(employeeDTO);
                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

            } else if (resp.equals("06")) {
                responseDTO.setResponseCode(VarList.RSP_DUPLICATED);
                responseDTO.setResponseMessage("Employee Already Registered");
                responseDTO.setContent(employeeDTO);
                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            } else {
                responseDTO.setResponseCode(VarList.RSP_FAIL);
                responseDTO.setResponseMessage("Error");
                responseDTO.setContent(null);
                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            responseDTO.setResponseCode(VarList.RSP_FAIL);
            responseDTO.setResponseMessage(e.getMessage());
            responseDTO.setContent(null);
            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


