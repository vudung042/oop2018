package week1;


public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
     return (s1.getGroup().equals(s2.getGroup()));
    }

    void studentsByGroup() {
        // TODO:
        for(int i=0;i<students.length-1;i++){
            for(int j=0;j<students.length;j++){
                if(students[i].getGroup().compareTo(students[j].getGroup())<0){
                    Student T = new Student();
                    T = students[i];
                    students[i] = students[j];
                    students[j] = T;
                }
            }
        }
    String group = " ";
        int i=0, n=students.length;
        while(i<n){
            if(students[i].getGroup().equals(group) == false) {
                group = students[i].getGroup();
                System.out.println("Danh sach sinh vien lop " + group +": ");
                System.out.println(students[i]);
            }
            else  System.out.println(students[i]);
            i++;
        }
    }

    void removeStudent(String id) {
        // TODO:
        int i;
        int n = students.length;
        for(i=0;i<n;i++){
            if(students[i].getId().equals(id)){
                n--;
                for(int j=i;j<n-1;j++)  students[j] = students[j+1];
            }

        }
    }

    public static void main(String[] args) {
        // TODO:
        Student std = new Student();
        Student std1 = new Student();
        Student std2 = new Student("Duc Dung", "17020643", "vudung042@gmail.com");
        Student std3 = new Student(std2);

        std.setName("Duc Dung");
        std.setId("17020643");
        std.setGroup("INT22042");
        std.setEmail("vudung042@gmail.com");

       System.out.println(std.getName());
       std.getInfo();
       std1.getInfo();
       std2.getInfo();
       std3.getInfo();

       System.out.println(sameGroup(std,std2));
       System.out.println(sameGroup(std,std3));
       System.out.println(sameGroup(std2,std3));
    }
}
