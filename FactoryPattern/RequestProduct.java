package FactoryPattern;

public interface RequestProduct {
    public void setPriority(String priority);
    public void setExpired(String expire);
    public void setStatus(String status);

    public void processRequest();
}
