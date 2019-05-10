import java.util.Scanner;

public class Person {
    public String name;
    public String ngay_thang;
    public int nam;
    public String diachi;

    public Person(){

    }
    public Person(String name,String ngay_thang,int nam, String diachi){
        this.name = name;
        this.ngay_thang = ngay_thang;
        this.nam = nam;
        this.diachi = diachi;
    }
    public static void main(String args[]){
        Person person = new Person();
        person.inputinfo();
        person.showinfo();
        Student std = new Student();
        std.check();
    }

    public void inputinfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten hoc sinh: ");
        name = scanner.nextLine();
        System.out.println("Nhap vao ngay thang sinh cua hoc sinh: ");
        ngay_thang = scanner.nextLine();
        System.out.println("Nhap vao nam sinh cua hoc sinh: ");
        nam = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap vao dia chi: ");
        diachi = scanner.nextLine();
    }
    public void showinfo(){
        System.out.println("Name: " + name);
        System.out.println("Date: " + ngay_thang + "/" + nam);
        System.out.println("Dia chi: " + diachi);
    }
}
