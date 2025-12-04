public class Batch {
    // Batch status
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    private String batchId;
    private int status;
    private int studentCount;

    public Batch() {
    }

    public Batch(String batchId, int status, int studentCount) {
        this.batchId = batchId;
        this.status = status;
    }

    public String getBatchId() {
        return batchId;
    }
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStudentCount() {
        return studentCount;
    }   

    public void  changeStatus() {
        if(this.status == ENROLLMENTOPEN) {
            this.status = ENROLLMENTCLOSED;
        } 
    }

    @Override
    public String toString() {
        return String.format(
        "%-12s%-15d%-20s",
        batchId,
        studentCount,
        (status == 1 ? "ENROLLMENT OPEN" : "ENROLLMENT CLOSED")
    );
    }
    
    
}
