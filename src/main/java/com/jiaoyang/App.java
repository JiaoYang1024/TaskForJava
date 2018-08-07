package com.jiaoyang;

import com.jiaoyang.dao.IStudent;
import com.jiaoyang.dao.StudentJDBCTemplate;
import com.jiaoyang.model.Employee;
import com.jiaoyang.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;


    static {

        try {
            reader = Resources.getResourceAsReader("Configure.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSessionFactory.getConfiguration().addMapper(IStudent.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
       // C:\workspace\HelloIdea\src\config\Configure.xml
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }



    public static void main( String[] args ) {


        SqlSession session = sqlSessionFactory.openSession();

       /* Student student = session.selectOne(
                "com.jiaoyang.model.StudentMapper.GetUserByID",1);

        if (student != null){
            System.out.println(student.toString());
        }
*/
        IStudent iStudent = session.getMapper(IStudent.class);

      /* Student newStudent = iStudent.getUserByName("张飞");

        if (newStudent != null){
            System.out.println(newStudent.toString());
        }*/
      // iStudent.createTable();
      //  Employee zhu = new Employee("猪八戒",22,"男","司机");
      // iStudent.insertUser(zhu);
       /* Employee zhang = iStudent.query(2);
        zhang.setUpdate_at(new Date().getTime());
        zhang.setJob("挑山工");
        iStudent.update(zhang);*/
      // iStudent.deleteUser(1);
       //
     /*  List<Employee> employees =iStudent.queryAll();
       for (Employee e : employees){
           System.out.println(e.toString());
       }*/
     iStudent.insertRecord("唐僧338888");
        iStudent.insertRecordTest("唐僧366344444444","男");
        session.commit();
       // iStudent.deleteTable();
      //  iStudent.createTable();
        session.close();
        /*ApplicationContext context = new ClassPathXmlApplicationContext("application-beans.xml");
        StudentJDBCTemplate jdbcTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");*/

        //jdbcTemplate.deleteTable();
        //jdbcTemplate.createTable();
        //Student student = new Student("王庸之", "861684014", "JAVA工程师", "2018年4月27日之前", "南京航空航天大学机电学院", "JAVA-3834", "http://www.jnshu.com/school/21289/daily", "破釜沉舟，破而后立。", "宋尚", " 从\"知乎\"处了解到IT修真院的。");

       /* Student student = new Student("张无忌5", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");

        Student student1 = new Student("张无忌1", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student2 = new Student("张无忌2", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student3 = new Student("张无忌3", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");
        Student student4 = new Student("张无忌4", "55552222", "CSS工程师", "2018年9月27日", "清华大学", "CSS-3834", "http://www.jnshu.com/school/21289/daily", "我最摇摆", "宋青书", "赵敏推荐");

        jdbcTemplate.insertRecord(student);
        jdbcTemplate.insertRecord(student1);
        jdbcTemplate.insertRecord(student2);
        jdbcTemplate.insertRecord(student3);
        jdbcTemplate.insertRecord(student4);*/

      /* jdbcTemplate.deleteRecord("张无忌4");
       jdbcTemplate.update("张无忌","张无忌5");
        jdbcTemplate.update("金毛狮王","张无忌1");
        jdbcTemplate.update("白眉鹰王","张无忌2");
        jdbcTemplate.update("紫衫龙王","张无忌3");*/
        /*List<Student> students =  jdbcTemplate.queryAll();
        for (Student s : students){
            System.out.println(s.toString());
        }*/
     /*Student student =  jdbcTemplate.query("金毛狮王");
        System.out.println(student.toString());*/


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
