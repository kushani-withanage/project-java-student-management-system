public class Batch {
    // Batch status
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    private String batchId;
    private int status;

    public Batch() {
    }

    public Batch(String batchId, int status) {
        this.batchId = batchId;
        this.status = status;
    }
    
    
}
