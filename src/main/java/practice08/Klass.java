package practice08;

public class Klass {
    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    private  Student leader;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private  int number;
    public Klass(int number) {
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+number;
    }
    public void assignLeader(Student student){
        student.getKlass().setLeader(student);
    }
}
