package J_Collections;

public class Student {
    private int roll_no;
    private String name;

    //alt+insert = constructor shortcut

//    empty constructor
    public Student() {
    }



    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

//setter
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }


//    getter
    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }
}
