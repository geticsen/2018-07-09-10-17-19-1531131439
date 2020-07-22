package practice09;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Klass {
    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    private Student leader;
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
        if(student.getKlass() != this){
            System.out.print("It is not one of us.\n");
        }else {
            student.getKlass().setLeader(student);
        }

    }
    public void appendMember(Student student){
        student.setKlass(this);
    }
}
