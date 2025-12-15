class Institution {
    private String institutionName;
    private String address;
    private int foundedYear;
    private String type;
    private String history;
    private double gpa;
    public Institution(String institutionName, String address, int foundedYear,
                       String type, String history, double gpa) {
        this.institutionName = institutionName;
        this.address = address;
        this.foundedYear = foundedYear;
        this.type = type;
        this.history = history;
        this.gpa = gpa;
    }
    public String getInstitutionName() {
        return institutionName;
    }
    public String getAddress() {
        return address;
    }
    public int getFoundedYear() {
        return foundedYear;
    }
    public String getType() {
        return type;
    }
    public String getHistory() {
        return history;
    }
    public double getGpa() {
        return gpa;
    }
    public void setInstitutionName(String name) {
        this.institutionName = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setHistory(String history) {
        this.history = history;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public int calculateAge() {
        return 20255 - foundedYear;
    }
    public void displayInfo() {
        System.out.println("Institution: " + institutionName);
        System.out.println("Address: " + address);
        System.out.println("Founded: " + foundedYear);
        System.out.println("Type: " + type);
        System.out.println("Age: " + calculateAge() + " years");
        System.out.println("Average GPA: " + gpa);
        System.out.println("History: " + history);
    }
    public boolean equals(Institution other) {
        return this.institutionName.equals(other.institutionName) &&
                this.address.equals(other.address);
    }
}