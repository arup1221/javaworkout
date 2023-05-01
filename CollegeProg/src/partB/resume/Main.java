package partB.resume;
abstract class Resume {
    public void personalInfo(){
        System.out.println("Name: Arup");
        System.out.println("Phone: 6295887971");
    }
    public abstract void bioData();
}

class Teacher extends Resume{
    String qualification , achievements;
    int experience;
     public Teacher(String qualification,int experience,String achievements){
         this.qualification = qualification;
         this.experience = experience;
         this.achievements = achievements;
     }

   public void bioData(){
       System.out.println("Qualification: " + qualification);
       System.out.println("Experience: " + experience +"years");
       System.out.println("Achievemetns: " + achievements);
   }
}
class Student extends Resume{
    String result ;
    String discipline;
    public Student(String result, String discipline){
        this.result = result;
        this.discipline = discipline;
    }
    public void bioData(){
        System.out.println("Result:" + result);
        System.out.println("Discipline: " + discipline);
    }
}
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Phd in cse",10,"5 tech papers");
        Student student = new Student("8.4 gpa","CSE");
        System.out.println("Teacher:");
        teacher.personalInfo();
        teacher.bioData();
        System.out.println();
        System.out.println("Student:");
        student.personalInfo();
        student.bioData();
    }
}
