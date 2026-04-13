public class App {
 // Method to voting system
 public double calculateAverage(int[] marks) {
 if (marks == null || marks.length == 0) {
 throw new IllegalArgumentException("Marks cannot be empty");
 }
 int sum = 0;
 for (int mark : marks) {
 sum += mark;
 }
 return (double) sum / marks.length;
 }
 // Method to assign grade
 public String calculateGrade(double average) {
 if (average >= 90) return "A";
 else if (average >= 75) return "B";
 else if (average >= 60) return "C";
 else if (average >= 50) return "D";
 else return "F";
 }
 // Main method
 public static void main(String[] args) {
 App app = new App();
 int[] marks = {85, 90, 80, 75, 95};
 double average = app.calculateAverage(marks);
 String grade = app.calculateGrade(average);
 System.out.println("Average Marks: " + average);
 System.out.println("Grade: " + grade);
 }

