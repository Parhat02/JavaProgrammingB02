package week10.day31_inheritance.day31Tasks.studentTask;

public class CydeoStudent extends Student{

    private String programmingLanguage;
    private int batchNumber, groupNumber;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy,
                        String schoolName, char grade, String programmingLanguage, int batchNumber, int groupNumber) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setProgrammingLanguage(programmingLanguage);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
    }

    public String getProgrammingLanguage() {
        if (programmingLanguage == null){
            System.err.println("The programmingLanguage should not be set to null.");
            System.exit(1);
        }
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage.isEmpty()){
            System.err.println("The programmingLanguage should not be empty.");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0){
            System.err.println("BatchNumber should not be set to zero or negative.");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0){
            System.err.println("GroupNumber should not be set to zero or negative.");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
