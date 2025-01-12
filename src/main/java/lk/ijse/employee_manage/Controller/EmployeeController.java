package lk.ijse.employee_manage.Controller;

import lk.ijse.Emplyee_Manage.DTO.EmployeeDTO;
import lk.ijse.Emplyee_Manage.DTO.ResponseDTO;
import lk.ijse.Emplyee_Manage.Service.EmployeeService;
import lk.ijse.Emplyee_Manage.Util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: vishmee
 * Date: 1/10/25
 * Time: 4:53 PM
 * Description:
 */
@RestController
@RequestMapping("api/v1/employee")
@Service
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

/*
    @Autowired
*/
    private ResponseDTO responseDTO;

   @PostMapping(value = "/saveEmployee")
    public ResponseEntity saveEmployee(@RequestBody EmployeeDTO employeeDTO){
try {
    String resp = employeeService.saveEmployee(employeeDTO);
    if (resp.equals("O3")){
        responseDTO.setResponseCode(VarList.RSP_SUCCESS);
        responseDTO.setResponseMessage("Success");
        responseDTO.setContent(employeeDTO);
        return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

    }else if(resp.equals("06")){
        responseDTO.setResponseCode(VarList.RSP_DUPLICATED);
        responseDTO.setResponseMessage("Employee Already Registered");
        responseDTO.setContent(employeeDTO);
        return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

    }else {
        responseDTO.setResponseCode(VarList.RSP_FAIL);
        responseDTO.setResponseMessage("Error");
        responseDTO.setContent(null);
        return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

    }
} catch (Exception e) {
    responseDTO.setResponseCode(VarList.RSP_FAIL);
    responseDTO.setResponseMessage(e.getMessage());
    responseDTO.setContent(null);
    return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);}
   }

}

