package week2.task3;

import java.security.SecureRandom;
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
public class Task3 {
    public static void main(String[] agrs) {
        System.out.println("Class Teacher: ");
        Teacher tc1 = new Teacher("Hoa", 56, "Woman");
        Teacher tc2 = new Teacher("Lan",40,"Woman");
        tc1.getInfo();
        tc1.checkAge();
        tc1.Testage();

        System.out.println("Class Cat: ");
        Cat cat = new Cat("Blue",2,"Man",2);
        cat.getInfo();
        cat.checkWeight();
        cat.voiceCat();

        System.out.println("Class Father: ");
        Father ft1 = new Father("H",49,"Farmer",170,55);
        ft1.getInfo();
        ft1.checkAge();
        ft1.Iq();
    }
}
 class Teacher{
        private int age;
        private String name, sex;
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setSex(String sex){
            this.sex = sex;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public String getSex(){
            return sex;
        }
        public Teacher(String n, int a, String s){
            name = n;
            age = a;
            sex = s;
        }
        public void getInfo(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Sex: " + sex);
        }
        public void Testage(){
            if(age<=60)
                System.out.println("Teacher còn "+(60-age)+" năm là về nghỉ hưu!!!");
            else
                System.out.println("Teacher đã nghỉ hưu được "+(age-60)+"năm!!!");
        }
        public void checkAge(){
            if(age<=60)
                System.out.println("Giáo viên của mình vẫn dậy học trên trường :v");
            else
                System.out.println("Đã có tuổi và được về nghỉ hưu!!!");
        }
    }

 class Cat{
        private int age;
        private float weight;
        private String name, sex;

        public void setAge(int age){
            this.age = age;
        }
        public void setWeight(float weight){
            this.weight = weight;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setSex(String sex){
            this.sex = sex;
        }
        public int getAge(){
            return age;
        }
        public float getWeight(){
            return weight;
        }
        public String getName(){
            return name;
        }
        public String getSex(){
            return sex;
        }

        public Cat(String n, int a, String s, float w){
            name = n;
            age = a;
            sex = s;
            weight = w;
        }
        public void getInfo(){
            System.out.println("Name: "+name+"  Age: "+age+"  Sex: "+sex+"  Weight: "+weight);
        }
        public void checkWeight(){
            if(weight<=1)  System.out.println("Thú cưng của bạn quá nhẹ cân >> Bạn cần phải bồi bổ thêm cho nó nhé!!!");
            else if(weight>1&&weight<=2.5)
                System.out.println("Thú cưng của bạn cân đối đấy >> Nhớ bảo vệ nó cẩn thận nhé ^^");
            else System.out.println("Thú cưng của bạn hơi thừa cân rồi nhé :v");
        }
        public void voiceCat(){
            System.out.println("Tiếng kêu: Meooooo meooooo meoooooooooooooooo");
        }
    }

 class Father{
        private String name, job;
        private int IQ, age, weight;

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setJob(String job){
            this.job = job;
        }
        public void setIQ(int IQ){
            this.IQ = IQ;
        }
        public void setWeight(int weight){
            this.weight = weight;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public String getJob(){
            return  job;
        }
        public int getIQ(){
            return IQ;
        }
        public int getWeight(){
            return weight;
        }

        public Father(String n, int a, String j, int iq, int w){
            name = n;
            age = a;
            job = j;
            IQ = iq;
            weight = w;
        }
        public void getInfo(){
            System.out.println("Name: "+name+"  Age: "+age+"  Job: "+job+"  Iq: "+IQ+"  Weight: "+weight);
        }
        public void checkAge(){
            if(age<35) System.out.println("Bố còn trẻ và phong độ!!!");
            else  if(age>=35 && age<=50)
                System.out.println("Bố đã ở tuổi tứ tuần :v");
            else System.out.println("Bố đã có tuổi rồi phải chăm sóc bố cẩn thận !!!");
        }

        public void Iq(){
            if(IQ>=150) System.out.println("Bố thông minh >> Con thật tự hào về bố!!!");
            else System.out.println("Có tuổi rồi nên bố không còn được như hồi trẻ.");
        }
    }




