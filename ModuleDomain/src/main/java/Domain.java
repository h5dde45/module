import entity.Project;

public class Domain {
    public static void main(String[] args) {
//        Employee employee=new Employee();
//        employee.setId(1L);
//        employee.setFirstName("per");
//        employee.setLastName("PER");

        Project project = new Project();
        project.setId(2L);
        project.setTitle("Title");
        System.out.println(project);
    }
}
