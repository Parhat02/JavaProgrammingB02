package week10.day31_inheritance.day31Tasks.statesTask;

public class States {

    private String name, abbreviation, politicalParty, governor, senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator,
                  int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        if (name == null){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        if (abbreviation == null){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.isEmpty() || abbreviation.isBlank()){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        if (politicalParty == null){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.isEmpty() || politicalParty.isBlank()){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        if (governor == null){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor.isEmpty() || governor.isBlank()){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        if (senator == null){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isEmpty() || senator.isBlank()){
            System.err.println("Can not be null/empty/blank");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        if (population == 0){
            System.err.println("Population can not be zero or negative.");
            System.exit(1);
        }
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0){
            System.err.println("Population can not be zero or negative.");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax < 0){
            System.err.println("TaxRate can not be negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
