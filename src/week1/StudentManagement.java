package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)


    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
     return (s1.getGroup().equals(s2.getGroup()));
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student std = new Student();
        Student std1 = new Student();
        Student std2 = new Student("Duc Dung", "17020643", "vudung042@gmail.com");
        Student std3 = new Student(std2);

        std.setName("Duc Dung");
        std.setId("17020643");
        std.setGroup("INT2204 8");
        std.setEmail("vudung042@gmail.com");

       System.out.println(std.getName());
       std.getInfo();
       std1.getInfo();
       std2.getInfo();
       std3.getInfo();
    }
}
