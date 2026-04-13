package com.voting;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private String voterId;
    private boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCitizenship() { return citizenship; }
    public String getVoterId() { return voterId; }
    public boolean isIdValid() { return isIdValid; }
}
package com.voting;

public class App {
    public String checkEligibility(int age, String citizenship, boolean hasValidID) {
        if (age < 18) return "Ineligible: Underage";
        if (!citizenship.equalsIgnoreCase("Indian")) return "Ineligible: Not a citizen";
        if (!hasValidID) return "Ineligible: Invalid ID";
        return "Eligible to Vote";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Status: " + app.checkEligibility(20, "Indian", true));
    }
}
