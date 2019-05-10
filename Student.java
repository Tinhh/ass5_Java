
public class Student extends Person {
    public Student(){

    }
    public Student(String name,String ngay_thang,int nam, String diachi){
        this.name = name;
        this.ngay_thang = ngay_thang;
        this.nam = nam;
        this.diachi = diachi;
    }

  public void check(){
        int age = 2019 - nam;
        if(age < 18){
            System.out.println("hoc sinh" + name + " chua du 18 tuoi");

        }
        else {
            System.out.println("Hoc sinh "+ name + " da du 18 tuoi");

        }
  }
}
