package practice07;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private  String name;
    private  int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        String line = "My name is "+name+". I am "+age+" years old.";
        return line;
    }
}

