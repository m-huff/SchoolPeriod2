package school;

public class Teacher extends Person {
    
    private int meanness;
    private Course[] courses = new Course[Course.PERIODS];
    
    public Teacher() {
        super();
        meanness = 0;
    }
    public Teacher(String _name,Gender _gender,int _weight,int _meanness) {
        super(_name, _gender, _weight);
        meanness = _meanness;
        if (meanness > 10) meanness = 10;
        if (meanness < 0) meanness = 0;

    }
    
    public int getMeanness() {
        return meanness;
    }
    
    public void setMeanness(int _meanness) {
        meanness = _meanness;
        if (meanness > 10) meanness = 10;
        if (meanness < 0) meanness = 0;
    }

    public static Teacher addTeacher(String _name,
    Gender _gender, int _weight,int _meanness)
    {
        Teacher temp = new Teacher(_name,_gender,_weight,
        _meanness);
        addPerson(temp);
        return(temp);
    }    

    public void addCourse(Course _course)
    {
        if (courses[_course.getPeriod()-1] == null)
        {
            courses[_course.getPeriod()-1] = _course;
           // _course.setTeacher(this);
        }
    }   
    
    public static void printNames()
    {
        System.out.println(
        "===printNamesOfTeachers=== ");
        for (Person temp : people)
        {
            if (temp instanceof Teacher)
                System.out.println(temp.getName());
        }
             
    }   
    
//    public void printStudentName() {
//        if (theCourse != null) {
//            Student s = theCourse.getStudent();
//            if (s != null)
//                System.out.println(getName() + " teaches " + s.getName());
//        }
//        else System.out.println(getName() + " teaches no one");
//    }
    
    public void printStudentsNames()
    {
        System.out.println(getName() + " teaches:");
        for (Course temp : courses) {
            if (temp != null) {
                for (Student s : temp.getStudents()) {
                    if (s != null)
                        System.out.println(s.getName());
                }
            }
        }
    }
    
    public void printTeachersMeanerThan(double _mean)
    {
        for (Person temp : people)
        {
            if (temp instanceof Teacher) {
                if (((Teacher)temp).getMeanness() > _mean)
                    System.out.println(temp.getName());
            }
        }
             
    }
}
