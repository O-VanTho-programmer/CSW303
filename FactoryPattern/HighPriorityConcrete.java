package FactoryPattern;

import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {

    private String priority;
    private String expireDate;
    private String status;

    HighPriorityConcrete(){
        this.priority = "Emergency";
        this.status = "Accepted";
        this.expireDate = LocalDate.now().toString();
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
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

}
