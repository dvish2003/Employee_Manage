package lk.ijse.employee_manage;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManageApplication.class, args);


    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
