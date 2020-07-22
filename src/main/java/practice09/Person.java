package practice09;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private  int id;
    public Person(int id, String name){
        this.name = name;
        this.id = id;
    }
    public Person(int id, String name,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public String introduce(){
        String line = "My name is "+name+". I am "+age+" years old.";
        return line;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSameOne = false;
        if(obj instanceof Person){
            if(this.getId() == ((Person) obj).getId()){
                isSameOne = true;
            }
        }
        return isSameOne;
    }
}

