//package Controller;
//
//import org.springframework.context.support.GenericXmlApplicationContext;
//
//import java.util.List;
//
//public class SpringJpaSample {
//    public static void main(String[] args) {
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("/root/IdeaProjects/REST/src/main/webapp/WEB-INF/app-context-annotation.xml");
//        ctx.refresh();
//
//        EmployeeService service = ctx.getBean("Service", EmployeeService.class);
//        listContacts("Find all",service.findAll());
////        listContacts("Find By ID", service.findById());
//    }
//
//    private static void listContacts(String massage, List<Employee> employees) {
//        System.out.println("");
//        System.out.println(massage);
//        for(Employee employee: employees){
//            System.out.println(employee);
//            System.out.println();
//        }
//    }
//}