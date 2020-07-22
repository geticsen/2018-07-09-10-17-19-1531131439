package practice06;

public class Teacher extends Person{
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    private int klass;
    public Teacher(String name, int age ,int kclass) {
        super(name, age);
        this.klass = kclass;
    }
    public Teacher(String name, int age) {
        super(name, age);
        this.klass = -1;
    }
    @Override
    public String introduce() {
        //My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
        String line = "";
        if(klass!=-1){
            line = super.introduce() + " I am a Teacher. I teach Class "+klass+".";
        }else {
            //My name is Tom. I am 21 years old.
            line = super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return line;
    }

}
