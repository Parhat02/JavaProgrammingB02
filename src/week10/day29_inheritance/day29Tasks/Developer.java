package week10.day29_inheritance.day29Tasks;

import java.util.Arrays;

public class Developer extends Workers {
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        String[] languages = {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"};
        if (Arrays.asList(languages).contains(programingLanguage)){
            this.programingLanguage = programingLanguage;
        }else {
            System.err.println("Invalid Entry, programming language can only be set to one of the followings:\n" +
                    "\t\t\t\t\t\t{\"Java\", \"JavaScript\", \"Python\", \"Ruby\", \"C#\", \"C++\", \"Swift\"}");
            System.exit(1);
        }
    }

    public Developer() {
    }

    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary, String programingLanguage) {
        this.setInfo(name, gender,  age, id, jobTitle, salary);
        setProgramingLanguage(programingLanguage);
    }

    public void coding(){
        System.out.println(getName() + " is coding");
    }

    @Override
    public String toString() {
        return "Developer{" + "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", programingLanguage='" + programingLanguage + '\'' +
                '}';
    }
}
