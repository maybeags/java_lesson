package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentSet {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220030, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220020, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        System.out.println(students);

        int cmpId = 20220000;
        int j = 0;

        List<Student> sortStudents = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++) {
            cmpId++;
            for(Student student : students) {
                if(student.getId() == cmpId) {
                    sortStudents.add(student);
                }
            }
        }

        System.out.println(sortStudents);
        System.out.println("<<<<<<<<< 정렬 >>>>>>>");

        /*
            1. 김혜진 학생의 학번을 출력하세요.
            2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
            3. 20220001 학번이 존재하면 해당 학생을 삭제하세요.

            set -> list 변환
            해당 list를 학번 순서에 맞게 정렬하시오.
         */

        String searchName = "김혜진";

        for(Student student : students) {
            if(student.getName().equals(searchName)) {
                System.out.println(searchName + "학생의 학번: " + student.getId());
                break;
            }
        }

        int searchId = 20220004;

        for(Student student : students) {
            if(student.getId() == searchId) {
                student.setName("설민수");
                break;
            }
        }

        searchId = 20220001;

        for(Student student : students) {
            if(student.getId() == searchId) {
                students.remove(student);
                break;
            }
        }

        System.out.println(students);


    }

}