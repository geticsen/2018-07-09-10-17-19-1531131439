package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass implements  JoinSubject{
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<Student>();
    private List<JoinListener> listeners = new ArrayList<JoinListener>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void addTeacher(JoinListener joinListener) {
        this.listeners.add(joinListener);
    }

    public void assignLeader(Student student) {
        if (this.members.contains(student)) {
            this.leader = student;
            for (JoinListener joinListener:this.listeners) {
                joinListener.updade(student);
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        this.members.add(student);
        student.updateKlass(this);
        for (JoinListener joinListener:this.listeners) {
            joinListener.updade(student);
        }
    }

    public boolean isIn(Student student) {
        if (this.members.contains(student)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void subjectNotify() {

    }
}
