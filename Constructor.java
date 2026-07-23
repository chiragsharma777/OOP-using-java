// Constructors

//Default Constructor

/*class Student {

    int id;
    String name;
}

public class  Constructor{
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.id);
        System.out.println(s.name);
    }
}
    */



//No-Argument Constructor


/*class Student{

    int id;
    String name;

    public Student(){
        id = 101;
        name = "Chirag";
    }
}


public class Constructor {

    public static void main(String[] args) {
        
        Student s = new Student();

        System.out.println(s.id);
        System.out.println(s.name);
    }
}
*/


//Parameterized Constructor

/*class Student{
    int id;
    String name;

    public Student(int myId, String myName){
        this.id = myId;
        this.name = myName;
    }
}

public class Constructor {

    public static void main(String[] args) {
        
        Student s = new Student(101, "chirag sharma");
        

        System.out.println(s.id);
        System.out.println(s.name);
    }
}
    */


//Copy Constructor

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Chirag");
        Student s2 = new Student(s1);

        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}