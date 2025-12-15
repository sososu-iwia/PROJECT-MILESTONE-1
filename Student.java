public class Student {
    private String name;
    private int id;
    private String major;
    private double gpa;
    public Student(String name, int id, String major, double gpa) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }
    public String getName() { return name; }
    public int getId() { return id; }
    public String getMajor() { return major; }
    public double getGpa() { return gpa; }
    public void setName(String name) { this.name = name; }
    public void setMajor(String major) { this.major = major; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void study() {
        System.out.println(name + " is studying " + major);
    }
    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
    public boolean equals(Student other) {
        return this.id == other.id;
    }
}