package OpinionPoll;

public class People {
    String[] people;

    public People(String[] person) {
        this.people = person;
    }
    public int getAge() {
        return Integer.parseInt(this.people[1]);
    }
    public String getName() {
        return this.people[0];
    }
}
