import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khơi tao doi tuong Student mânger
        StudentManager manager = new StudentManager(); // gọi hàm khoi tao ko tham so
        // hien thi menu
        while (true) {
            System.out.println("+---------------Menu----------------+");
            System.out.println("| 1. Hiển thị danh sách sinh viên   |");
            System.out.println("| 2. Thêm mới sinh viên             |");
            System.out.println("| 3. Chinnh sửa thông tin           |");
            System.out.println("| 4. Xóa sinh viên                  |");
            System.out.println("| 5. Thoát                          |");
            System.out.println("+-----------------------------------+");
            System.out.println("Hay nhap lua chon của bạn ");
            byte choice = Byte.parseByte(sc.nextLine());
            // phím tắt forrmat code : Ctrl ALT L
            switch (choice) {
                case 1:
                    // hien thi
                    manager.showListStudent();
                    break;
                case 2:
                    // thêm mơi
                    manager.addStudent(sc);
                    break;
                case 3:
                    // chỉnh sửa
                    manager.editStudent(sc);
                    break;
                case 4:
                    // xóa
                    manager.deleteStudent(sc);
                    break;
                case 5:
//                    return ;
//                    System.exit();
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    break;

            }
            if (choice == 5){
                break;
            }
        }
    }
}
