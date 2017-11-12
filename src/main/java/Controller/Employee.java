package Controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
public class Employee {
    @JsonProperty("name")
    @Column(name = "name")
    private String name;
    @JsonProperty("empId")
    @Column(name = "id")
    private @Id @GeneratedValue Long empId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    @JsonCreator
    Employee(@JsonProperty("empId") Long empId, @JsonProperty("name") String name){
        this.name = name;
        this.empId = empId;
    }
    Employee(){};
}
