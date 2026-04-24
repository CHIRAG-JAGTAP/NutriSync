package hib.beans;

public class Feedback 
{
    private int feedbackId;
   private String fullName;
   private String feedback;
   private String status;
    public Feedback() {
    }
    
    public Feedback(String fullName, String feedback, String status) {
        this.fullName = fullName;
        this.feedback = feedback;
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }
   
}
