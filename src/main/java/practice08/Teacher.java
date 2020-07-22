package practice08;


public class Teacher extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(int id, String name) {
        super(id, name);
    }
    public Teacher(int id, String name , int age) {
        super(id, name,age);
    }
    public Teacher(int id, String name , int age,Klass klass) {
        super(id, name,age);
        this.klass = klass;
    }
    public Teacher(int id, String name ,Klass klass) {
        super(id, name);
        this.klass = klass;
    }
    @Override
    public String introduce() {
        //My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
        String line = "";
        if(klass!=null){
            line = super.introduce() + " I am a Teacher. I teach Class "+klass.getNumber()+".";
        }else {
            //My name is Tom. I am 21 years old.
            line = super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return line;
    }
    public String introduceWith(Student student){
        String line = "";
        if(this.klass.getNumber() == student.getKlass().getNumber()){
            line = super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else{
            line = super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return line;
    }

}
