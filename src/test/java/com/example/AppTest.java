import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AppTest {
 App app = new App();
 @Test
 void testCalculateAverage() {
 int[] marks = {80, 90, 100};
 assertEquals(90.0, app.calculateAverage(marks));
 }
 @Test
 void testGradeA() {
 assertEquals("A", app.calculateGrade(92));
 }
 @Test
 void testGradeB() {
 assertEquals("B", app.calculateGrade(80));
 }
 @Test
 void testGradeC() {
 assertEquals("C", app.calculateGrade(65));
 }
 @Test
 void testGradeD() {
 assertEquals("D", app.calculateGrade(55));
 }
 @Test
 void testGradeF() {
 assertEquals("F", app.calculateGrade(40));
 }
 @Test
 void testEmptyMarks() {
 assertThrows(IllegalArgumentException.class, () -> {
 app.calculateAverage(new int[]{});
 });
 }

}

