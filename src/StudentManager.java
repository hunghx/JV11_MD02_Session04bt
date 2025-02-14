import java.util.Scanner;

public class StudentManager {
    private Student[] students = new Student[100];
    private int size;

    public StudentManager() {
        // Nhân đoi cú phap : Ctrl +D
        // them moi sinh vien mau
//        students[0] = new Student("SV001", "Nguyễn Văn A", 19, true, "Hà Nội", "0943784875");
//        students[1] = new Student("SV002", "Nguyễn Văn B", 18, false, "Hải Phòng", "0993447875");
//        students[2] = new Student("SV003", "Nguyễn Văn C", 19, true, "Nam Định", "0943293875");
//        size = 3;
    }
    // cac chuc nang của menu
    public void showListStudent() {
        // nếu như ko có sinh vien thì hiển thị chưa có sinh viên nào
        if(size == 0){
            System.out.println("Chưa có sinh viên nào");
        }else {
            // hien thi
            System.out.println("+------+---------------+---+----+---------------+-----------+");
            System.out.printf("|%6s|%15s|%3s|%4s|%15s|%11s|\n","ID","Name","Age","Sex","Address","Phone");
            System.out.println("+------+---------------+---+----+---------------+-----------+");
            // hien thi tưng hang cua bang
//            for(Student student : students){
//                if(student != null) {
//                    student.displayData();
//                }
//            }
            for (int i = 0; i < size ; i++) {
                students[i].displayData();
            }
        }
    }
    public void addStudent(Scanner scanner) {
        // Yêu cau người dung chon so luong sinh vien can nhap
        System.out.println("Nhap so luong can them : ");
        int n = Integer.parseInt(scanner.nextLine());
        // kích thuoc ko đc vươt quá 100
        if(size+n > 100){
            System.out.println("So luong sinh vien khong the qua 100");
        }else {
            // cho nhập n phan tu student băt đầu từ vị trí thứ size
            for(int i = 0; i < n ; i++){
                students[size+i] = new Student();
                students[size+i].inputData(scanner,true);
            }
            size += n;
            System.out.printf("Bạn vu nhap thông tin cho %d sinh viên\n",n);
        }
    }
    public void editStudent(Scanner scanner) {
        // Nhap vao id can sửa
        System.out.println("Nhap id can sửa");
        String id =scanner.nextLine();
        // tim kiếm
        for (int i = 0; i < size; i++) {
            if(students[i].getStudentId().equals(id)){
                // đôi tươg cần sửa
                students[i].inputData(scanner,false);
//                System.out.println("Nhap Name : ");
//                students[i].setStudentName(scanner.nextLine());
//                System.out.println("Nhap Age : ");
//                students[i].setAge(Integer.parseInt(scanner.nextLine()));
//                System.out.println("Nhap Sex(true/false) : ");
//                students[i].setSex(Boolean.parseBoolean(scanner.nextLine()));
//                System.out.println("Nhap Address : ");
//                students[i].setAddress( scanner.nextLine());
//                System.out.println("Nhap Phone : ");
//                students[i].setPhone( scanner.nextLine());
//                System.out.println("Chinh sủa thanh công");
                return;
            }
        }
        System.out.println("ko tim thấy id");
    }
    public void deleteStudent(Scanner scanner) {
        // logic xóa
        System.out.println("Nhap id can xóa");
        String id =scanner.nextLine();
        int indexDelete = -1;
        // tim kiếm
        for (int i = 0; i < size; i++) {
            if(students[i].getStudentId().equals(id)){
               indexDelete = i;
               break;
            }
        }
        if (indexDelete == -1){
            System.out.println("Không tìm thấy id");
            return;
        }
        // tiến hành xóa : 1,2,3,4,5,6,7,0,0,0,0,
        for (int i = indexDelete; i < size - 1 ; i++) {
            students[i] = students[i + 1];
        }
        size--;
        System.out.println("Xóa thành công");
    }



}
