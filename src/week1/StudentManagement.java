package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)


    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt
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
        std1.setName("Duc Dung");
        std1.setId("17020643");
        std1.setGroup("INT2204 8");
        std1.setEmail("vudung042@gmail.com");

       System.out.println(std1.getName());
       std1.getInfo();
    }
}
