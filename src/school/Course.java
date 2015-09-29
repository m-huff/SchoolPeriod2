
package school;
import java.util.ArrayList;
public class Course {
    enum Type {
        Math,Science,English,History,Language,Elective,PE
    }
    private static ArrayList<Course> courses = new ArrayList<Course>();
    private String name;
    private Type type;
    private int period;
    
    public static final int PERIODS = 4;
    
    private static ArrayList<Student> students = new ArrayList<Student>();
    private Teacher theTeacher;

    public static Course addCourse(String _name,
    Type _type, int _period)
    {
        Course temp = new Course(_name,_type,_period);
        courses.add(temp);
        return(temp);
    }
    Course()
    {
        name = "None";
        type = Type.Elective;
        period = 1;
    }
    Course(String _name,Type _type, int _period)
    {
        name = _name;
        type = _type;
        period = _period;
    }   

    public boolean addStudent(Student _student, double _gpa)
    {
        if (!setStudentOK(_student))
            return false;
        if (!_student.setCourseOK(this))
            return false;
        _student.setCourseDoIt(this, _gpa);
        setStudentDoIt(_student);
        return true;
    }     
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void addTeacher(Teacher _teacher)
    {
        if (theTeacher == null)
        {
            theTeacher = _teacher;
            _teacher.addCourse(this);
        }
    }   
    
    public Teacher getTeacher() {
        return theTeacher;
    }
    
    public boolean setStudentOK(Student _student) {
        if (_student != null && !students.contains(_student))
            return true;
        return false;
    }
    
    public void setStudentDoIt(Student _student) {
        students.add(_student);
    }
    
    public void setPeriod(int _period)
    {
        period = _period;
    }
    public int getPeriod()
    {
        return(period);
    }       
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }    
    public void setType(Type _type)
    {
        type = _type;
    }
    public Type getType()
    {
        return(type);
    }  
    public static void printNames()
    {
        System.out.println("===printNames===");
        for (Course temp : courses)
        {
                System.out.println(temp.getName());
        }        
    }    
    public String toString()
    {
        return(name + " " + type + " " + period + " ");// + theStudent.getName());
    }    
    
//    public Student[] getStudents() {
//        return students.;
//    }
}
