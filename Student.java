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
    

    
    

}