package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
//    @Override
    public List<Employee> findAll(){
        ArrayList list = (ArrayList) employeeRepository.findAll();
        return list;
    }
    @Override
    public Employee findById(Long id){
    return employeeRepository.findOne(id);
    }

    @Override
    public Employee save(Employee employee){
        employeeRepository.save(employee);
        return employee;
    }
    public void delete(Employee employee){
        employeeRepository.delete(employee);
    }
}
