import java.util.ArrayList;
import java.util.List;

public class StudentCRUD implements IGenericCRUD<Student,String>{
    private List<Student> students =new ArrayList<>();
    public StudentCRUD(){
        Student s1 = new Student("SV001", "Nguyễn Văn A", (byte)19, true, "Hà Nội", "0943784875");
        Student s2 = new Student("SV002", "Nguyễn Văn B", (byte)18, false, "Hải Phòng", "0993447875");
        Student s3 = new Student("SV003", "Nguyễn Văn C", (byte)19, true, "Nam Định", "0943293875");
        students.add(s1);
        students.add(s2);
        students.add(s3);
    }
    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Student findById(String id) {
        for (Student student : students){
            if(student.getStudentId().equals(id)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        if(findById(student.getStudentId())!=null){
            // sua
            int index = students.indexOf(findById(student.getStudentId()));
            students.set(index,student);
        }else{
            // them moi
            students.add(student);
        }
    }

    @Override
    public void deleteById(String id) {
        Student studentDel = findById(id);
        if(studentDel!= null){
            // có tôn tại
            students.remove(studentDel);
        }
    }
}
