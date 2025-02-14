import java.util.Scanner;

public class Student {
    //  các  thộc tính
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private String phone;

    // các phuong thuc khoi tao
    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean sex, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }
    // các phuong thuc get, set

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // các method khác
    public void inputData(Scanner scanner, boolean isAdd) {
        // nhap thong tin cua doi tuong
        if(isAdd) {
            System.out.println("Nhap Id : ");
            studentId = scanner.nextLine();
        }
        System.out.println("Nhap Name : ");
        studentName = scanner.nextLine();
        System.out.println("Nhap Age : ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Sex(true/false) : ");
        sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhap Address : ");
        address = scanner.nextLine();
        System.out.println("Nhap Phone : ");
        phone = scanner.nextLine();
    }

    public void displayData() {
        // hien thi thong tin cua doi tuong
        System.out.printf("|%6s|%15s|%3d|%4s|%15s|%11s|\n",studentId,studentName,age,sex?"Nam":"Nữ",address,phone);
        System.out.println("+------+---------------+---+----+---------------+-----------+");
    }
}
