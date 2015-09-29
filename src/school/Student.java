package school;
public class Student extends Person{
    private int gradeLevel;
    private Course[] courses = new Course[Course.PERIODS];
    private double[] gradeScore = new double[Course.PERIODS];

    public static Student addStudent(String _name,
    Gender _gender, int _weight,int _gradeLevel)
    {
        Student temp = new Student(_name,_gender,_weight,
        _gradeLevel);
        addPerson(temp);
        return(temp);
    }    
    Student (String _name,Gender _gender,int _weight,
    int _gradeLevel)
    {
        super(_name,_gender,_weight);
        gradeLevel = _gradeLevel;
    }
    public boolean addCourse(Course _course, double _gpa) {
        if (!setCourseOK(_course))
            return false;
        if (!_course.setStudentOK(this))
            return false;
        _course.setStudentDoIt(this);
        setCourseDoIt(_course, _gpa);
        return true;
    }       
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    }
    public int getGradeLevel()
    {
        return(gradeLevel);
    }        
    
    public boolean setCourseOK(Course _course) {
        if (_course == null)
            return false;
        if (courses[_course.getPeriod() - 1] != null)
            return false;
        return true;
    }
    
    public void setCourseDoIt(Course _course, double _gpa) {
        courses[_course.getPeriod()-1] = _course;
        gradeScore[_course.getPeriod()-1] = _gpa;
    }
    
    public static void printNames()
    {
        System.out.println(
        "===printNamesOfAllStudents=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
                System.out.println(temp.getName());
        }
             
    } 
    
    public void printTeachersNames()
    {
        System.out.println(getName() + " is taught by:");
        for (Course temp : courses)
        {
            if (temp != null)
                System.out.println(temp.getTeacher().getName());
        }
             
    }
    
    public double getGPA() {
        double gpa = 0.0;
        int course = 0;
        for (Course temp : courses) {
            if (temp != null) {
                gpa += gradeScore[temp.getPeriod()];
                course++;
            }
        }
        return gpa / course;
    }
}
