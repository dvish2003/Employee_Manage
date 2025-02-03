package lk.ijse.employee_manage.Service;

import jakarta.transaction.Transactional;
import lk.ijse.employee_manage.DTO.EmployeeDTO;
import lk.ijse.employee_manage.Entity.Employee;
import lk.ijse.employee_manage.Util.VarList;
import lk.ijse.employee_manage.repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: vishmee
 * Date: 1/10/25
 * Time: 4:05 PM
 * Description:
 */
@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;


    public String saveEmployee(EmployeeDTO employeeDTO){

      if(employeeRepo.existsById(employeeDTO.getEmpID())){
         return VarList.RSP_DUPLICATED;
      }else{
         employeeRepo.save(modelMapper.map(employeeDTO, Employee.class));
         return VarList.RSP_SUCCESS;
      }
    }
}
