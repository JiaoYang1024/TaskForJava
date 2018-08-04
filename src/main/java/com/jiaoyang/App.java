package com.jiaoyang;

import com.jiaoyang.dao.StudentJDBCTemplate;
import com.jiaoyang.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {



        ApplicationContext context = new ClassPathXmlApplicationContext("application-beans.xml");
        StudentJDBCTemplate jdbcTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        List<Student> students =  jdbcTemplate.queryAll();
        for (Student student : students){
            System.out.println(student.toString());
        }



        // DaoByJDBC dao = new DaoByJDBC();

        //dao.deleteTable();
        //dao.createTable();
        /*Student student = new Student("王庸之", "861684014", "JAVA工程师", "2018年4月27日之前", "南京航空航天大学机电学院", "JAVA-3834", "http://www.jnshu.com/school/21289/daily", "破釜沉舟，破而后立。", "宋尚", " 从\"知乎\"处了解到IT修真院的。");
        dao.insertData(student);*/

        // Student student = new Student("张无忌", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");

        /*Student student = new Student("张无忌5", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");

        Student student1 = new Student("张无忌1", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student2 = new Student("张无忌2", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student3 = new Student("张无忌3", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student4 = new Student("张无忌4", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        dao.insertData(student);
        dao.insertData(student1);
        dao.insertData(student2);
        dao.insertData(student3);
        dao.insertData(student4);*/
        // dao.deleteData("张无忌3");
        // dao.updateData("张无忌5","张飞");
        /*List<Student> students = dao.queryAll();
        for (Student student : students){
            System.out.println(student.toString());
        }
*/

        // Student student =  dao.query("张飞");
        // System.out.println(student.toString());
    }
}
