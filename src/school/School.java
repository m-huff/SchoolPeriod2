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
        
        Teacher yeet = 
        Teacher.addTeacher("Mr. Yeet",Person.Gender.Male,140,40);
        Teacher straug = 
        Teacher.addTeacher("Mrs. Straug",Person.Gender.Female,190,35);
        Teacher mack = 
        Teacher.addTeacher("Mrs. Mack",Person.Gender.Female,135,29);
        Teacher stan = 
        Teacher.addTeacher("Mr. Stan",Person.Gender.Male,170,51);
        
//        Person.printNames();
//        Person.printNames(Person.Gender.Female);

        Course geom = 
        Course.addCourse("Geometry", Course.Type.Math, 1);
        Course photo = 
        Course.addCourse("Photography", Course.Type.Elective, 3);
        Course cs = 
        Course.addCourse("Computer Science", Course.Type.Elective, 2);
        Course spanish = 
        Course.addCourse("Spanish", Course.Type.Language, 4);
        Course.printNames();
    
        
    //    geom.addPerson(joe);
 
 
        
        //System.out.println(joe);        
        geom.addStudent(john);
        spanish.addStudent(billyJoe);
        photo.addStudent(jill);
        cs.addStudent(joe);
        
        geom.addTeacher(straug);
        spanish.addTeacher(mack);
        photo.addTeacher(stan);
        cs.addTeacher(yeet);
        
        Person.printNames();
        Course.printNames();
        Student.printNames();
        Teacher.printNames();
        
        stan.printStudentName();
      
    }
}
