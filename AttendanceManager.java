package SS10.bai4;

import java.util.ArrayList;
import java.util.List;

public class AttendanceManager implements Manage <Student>{
    public List<Student>studentList=new ArrayList<>();


    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void update(int index, Student student) {
if (index>=0&&index<studentList.size()){
    studentList.set(index,student);
}
    }


    @Override
    public void delete(int index) {
        if (index>=0&&index<studentList.size()){
            studentList.remove(index);
        }
    }

    @Override
    public void display() {
if (studentList.isEmpty()){
    System.out.println("Chua co sinh vien nao trong danh sach");
}else {
    for (Student student : studentList) {
        student.toString();
    }
}
    }
}
