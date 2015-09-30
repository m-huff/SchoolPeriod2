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
    
    public static void printStudentWithHighestGPA()
    {
        System.out.println(
        "===getHighestGPA=== ");
        double highestGPA = 0.0;
        Student bestStudent = null;
        for (Person temp : people) {
            if (temp instanceof Student) {
                if (((Student)temp).getGPA() > highestGPA) {
                    highestGPA = ((Student)temp).getGPA();
                    bestStudent = ((Student)temp);
                }
            }
                
        }
        System.out.println(bestStudent.getName() + ": " + highestGPA);
    } 
    
    public static void printStudentWithMostElectives()
    {
        System.out.println(
        "===printStudentWithMostElectives=== ");
        int mostElectives = 0;
        Student student = null;
        for (Person temp : people) {
            if (temp instanceof Student) {
                int electives = 0;

                for (Course c : ((Student)temp).courses) {
                    if (c != null && c.getType() == Course.Type.Elective) {
                        electives++;
                    }
                }
                
                if (electives > mostElectives) {
                    mostElectives = electives;
                    student = ((Student)temp);
                }
            }
                
        }
        System.out.println(student.getName() + ": " + mostElectives);
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
    
    public void printNamesGPAGreaterThan(double _gpa)
    {
        for (Person temp : people) {
            if (temp instanceof Student) {
                if (((Student)temp).getGPA() > _gpa)
                    System.out.println(temp.getName());
            }
        }    
    }
    
    public double getGPA() {
        double gpa = 0.0;
        int course = 0;
        for (int i = 0; i < Course.PERIODS; i++) {
            if (gradeScore[i] != 0.0) {
                course++;
                gpa += gradeScore[i];
            }
        }
        if (course == 0)
            return 0;
        return gpa / course;
    }
    
    public void printGPA() {
        System.out.println(String.valueOf(getGPA()));
    }
    
    
}
