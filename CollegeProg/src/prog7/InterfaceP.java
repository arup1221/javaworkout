package prog7;

interface Resume{
    void biodata();
}

class Teacher implements Resume{
    String name, qulaification,achievement;
    float experience;
    public void biodata(){
        name = "Rohit Sharma";
        qulaification = "Mtech";
        achievement = "Q1 publication";
        experience = 14.8f;
        System.out.println("Teacher Resume");
        System.out.println("Name: " + name);
        System.out.println("Qualification: "+ qulaification);
        System.out.println("Achievement: "+ achievement);
        System.out.println("Experience: " + experience);
        System.out.println(" ");

    }
}
 class Student implements Resume{
    String name,discipline;
    float result;
    public void biodata(){
        name = "Rohit Sharma";
        discipline = "CSE";
        result = 4.8f;
        System.out.println("Teacher Resume");
        System.out.println("Name: " + name);
        System.out.println("Discipline: "+ discipline);
        System.out.println("Result: "+ result + " cgpa");
        System.out.println(" ");
    }
 }
public class InterfaceP {
    public static void main(String[] args) {
       Teacher obj1 = new Teacher();
        obj1.biodata();

        Student obj2 = new Student();
        obj2.biodata();
    }
}