package week10.week10_review;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name) {
        setName(name); // this.name = name;
    }

    public Person(String name, int age) {
        this(name); // setName(name);
        setAge(age);
    }

    public Person(String name, int age, String gender) {
        this(name, age); //setName(name); , setAge(age);
        setGender(gender);
    }

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

        if(age < 0){
            throw new RuntimeException("Age can not be negative: " + age);
        }

        this.age = age;
    }

    public String getGender() {
        if (gender == null){
            //   throw new RuntimeException("Gender has not ben set");
            return "Unknown";
        }
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
