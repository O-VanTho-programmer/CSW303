package FactoryPattern;


    
public interface RequestCreator {

    public RequestProduct createRequest();

    public String processRequest();
}