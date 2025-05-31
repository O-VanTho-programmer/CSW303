package FactoryPattern;

import java.time.LocalDate;

public class MediumPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDate;
    private String status;

    MediumPriorityConcrete() {
        this.priority = "Medium";
        this.expireDate = LocalDate.now().plusMonths(1).toString();
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is [" + expireDate + "]");
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
