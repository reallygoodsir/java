package scjp.collections.priorityqueue.task2;

public class Patient implements Comparable<Patient> {
    private Integer severity;
    private Integer arrivalTime;

    public Patient(Integer severity, Integer arrivalTime) {
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public Integer getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Integer arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "severity=" + severity +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    @Override
    public int compareTo(Patient o) {
        if(o.severity.equals(this.getSeverity())){
            return this.arrivalTime.compareTo(o.arrivalTime);
        }else{
            return o.severity.compareTo(this.getSeverity());
        }
    }
}
