package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation student = new Encapsulation();
        student.setName("Rahul");
        student.setMarks(73);

        System.out.println(student.getName() + " got " + student.getMarks() + " marks");
    }
}
