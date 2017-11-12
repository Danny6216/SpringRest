package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("")
public class HelloController {
//
//    EmployeeRepository rep;
//
//    @Autowired(required = false)
//    public HelloController(EmployeeRepository rep) {
//        this.rep = rep;
//    }

    EmployeeServiceImpl crud;
    @GetMapping(
            value = "/employees",
            headers = "Accept= application/json"
    )
    public List<Employee> getEmp(){
        ArrayList list = (ArrayList) crud.findAll();
        return list;

//        return (List<Employee>) rep.findAll();
//        List<Employee> listOfEmployees = new ArrayList();
//        listOfEmployees.add(new Employee(29, "Prakash"));
//        listOfEmployees.add(new Employee(30, "Rambir"));
//        listOfEmployees.add(new Employee(35, "Sachin"));
//        listOfEmployees.add(new Employee(25, "Martin"));
//        return listOfEmployees;
    }
    @PostMapping(
            value = "/employees",
            headers = "Accept= application/json"
    )
    public void postEmp(@RequestBody Employee postEmp){
        crud.save(postEmp);
//        rep.save(postEmp);
    }
//    @RequestMapping(value = "/employee/{id}", method =
//            RequestMethod.GET,headers="Accept=application/json")
//    public Employee getEmployeeById(@PathVariable int id){
//        List<Employee> listOfEmployees = new ArrayList<Employee>();
//        listOfEmployees=createEmployeeList();
//        for (Employee Employee: listOfEmployees) {
//            if(Employee.getEmpId()==id)
//                return Employee;
//        }
//        return null;
//    }


}
