package FactoryPattern;

import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDate;
    private String status;

    LowPriorityConcrete(){
        this.priority = "Ignore";
        this.expireDate = (LocalDate.now()).toString();
        this.status = "Done";
    }

    @Override
    public void setExpired(String expire) {
        this.expireDate = expire;
    }

    @Override
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
