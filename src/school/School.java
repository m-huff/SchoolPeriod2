package school;
public class School {
    public static void main(String[] args) {
        Student joe = 
        Student.addStudent("Joe",Person.Gender.Male,120,10);
        Student jill = 
        Student.addStudent("Jill",Person.Gender.Female,105,9);
        Student billyJoe = 
        Student.addStudent("BillyJoe",Person.Gender.Male,210,12);
        Student john = 
        Student.addStudent("John",Person.Gender.Male,45,11);
        
        Teacher dootdoot = 
        Teacher.addTeacher("Mr. Skeltal",Person.Gender.Male,140,40);
        Teacher straug = 
        Teacher.addTeacher("Mrs. Straug",Person.Gender.Female,190,35);
        Teacher mack = 
        Teacher.addTeacher("Mrs. Mack",Person.Gender.Female,135,29);
        Teacher stan = 
        Teacher.addTeacher("Mr. Stan",Person.Gender.Male,170,51);
        
//        Person.printNames();
//        Person.printNames(Person.Gender.Female);

        Course geom = 
        Course.addCourse("Geometry", Course.Type.Math, 1, true);
        Course photo = 
        Course.addCourse("Photography", Course.Type.Elective, 3, false);
        Course cs = 
        Course.addCourse("Computer Science", Course.Type.Elective, 2, false);
        Course spanish = 
        Course.addCourse("Spanish", Course.Type.Language, 4, false);
        Course.printNames();
    
        
    //    geom.addPerson(joe);
 
 
        
        //System.out.println(joe);        
        geom.addStudent(john, 4.0);
        spanish.addStudent(billyJoe, 3.1);
        photo.addStudent(jill, 2.0);
        cs.addStudent(joe, 3.5);
        
        geom.addTeacher(straug);
        spanish.addTeacher(mack);
        photo.addTeacher(stan);
        cs.addTeacher(dootdoot);
        
        Person.printNames();
        Course.printNames();
        Student.printNames();
        Teacher.printNames();

        Student.printStudentWithHighestGPA();
        Student.printStudentWithMostElectives();
        
        Student.printHonorsStudents();
      
    }
}
