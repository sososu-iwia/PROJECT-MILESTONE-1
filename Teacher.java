class Teacher {
    private String name;
    private int employeeId;
    private String subject;
    private int yearsOfExperience;
    public Teacher(String name, int employeeId, String subject, int yearsOfExperience) {
        this.name = name;
        this.employeeId = employeeId;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getName() {
        return name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getSubject() {
        return subject;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }
    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
    public boolean isSenior() {
        return yearsOfExperience > 10;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
    public boolean equals(Teacher other) {
        return this.employeeId == other.employeeId;
    }
}
