public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private boolean hasValidID;

    public Voter(String name, int age, String citizenship, boolean hasValidID) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.hasValidID = hasValidID;
    }

    public String checkEligibility() {
        if (age < 18) return "Ineligible: Underage (Must be 18+)";
        if (!citizenship.equalsIgnoreCase("Indian")) return "Ineligible: Not a citizen";
        if (!hasValidID) return "Ineligible: Invalid or missing Voter ID";
        return "Eligible to Vote";
    }

    public static void main(String[] args) {
        Voter v1 = new Voter("Alice", 20, "Indian", true);
        System.out.println(v1.name + ": " + v1.checkEligibility());
    }
}
