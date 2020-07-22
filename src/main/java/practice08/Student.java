package practice08;


public class Student extends Person {
    private Klass klass;
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name) {
        super(id, name);
        this.klass = klass;
    }
    public Student(int id, String name,int age, Klass klass) {
        super(id, name,age);
        this.klass = klass;
    }
    public Student(int id, String name,Klass klass) {
        super(id, name);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        //My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
        String line = "";
        if(this == this.getKlass().getLeader()){
            line = super.introduce()+" I am a Student. I am Leader of Class "+klass.getNumber()+".";
        }else {
            line = super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
        }
        return line;
    }
}
