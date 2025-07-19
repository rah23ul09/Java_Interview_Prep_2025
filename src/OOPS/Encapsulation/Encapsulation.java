/* This wrapping of data which cannot be accessed by outside world is called data encapsulation */

package OOPS.Encapsulation;

public class Encapsulation {
    // below data cannot be accessed
    private String name;
    private int marks;

    // using setter method to set value
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // using getter method to access variables
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}


