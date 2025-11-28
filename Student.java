class Student{
    private String regNo;
    private String nic;
    private String name;
    private int prf;
    private int dbms;

    public Student() {
    }
    
    public Student(String regNo, String nic, String name, int prf, int dbms) {
        this.regNo = regNo;
        this.nic = nic;
        this.name = name;
        this.prf = prf;
        this.dbms = dbms;
    }
    
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrf() {
        return prf;
    }

    public void setPrf(int prf) {
        this.prf = prf;
    }

    public int getDbms() {
        return dbms;
    }

    public void setDbms(int dbms) {
        this.dbms = dbms;
    }

    public double getGPA(){
        return (calculateGPA(this.prf)+calculateGPA(this.dbms))/2.0;
    }

    public double calculateGPA(int marks) {
        if (marks >= 90) return 4.25;
        else if (marks >= 80) return 4.0;
        else if (marks >= 75) return 3.7;
        else if (marks >= 70) return 3.3;
        else if (marks >= 65) return 3.0;
        else if (marks >= 60) return 2.7;
        else if (marks >= 55) return 2.3;
        else if (marks >= 50) return 2.0;
        else if (marks >= 45) return 1.7;
        else if (marks >= 40) return 1.3;
        else if (marks >= 30) return 1.0;
        else if (marks >= 20) return 0.7;
        else return 0.0;
    }

    @Override
    public String toString() {
        return "\n\tRegistration no      : " + this.regNo +
               "\n\tNIC                 : " + this.nic +
               "\n\tName                : " + this.name +
               "\n\tPRF Marks          : " + (this.prf == -1 ? "Absent" : this.prf == -2 ? "Not conducted" : this.prf) +
               "\n\tDBMS Marks         : " + (this.dbms == -1 ? "Absent" : this.dbms == -2 ? "Not conducted" : this.dbms) +
               "\n\tGPA                 : " + String.format("%.2f", getGPA());
    }


    

    
    

}