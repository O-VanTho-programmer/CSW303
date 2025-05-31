package FactoryPattern;

public class HighPriorityConcreteCreator implements RequestCreator{

    @Override
    public RequestProduct createRequest() {
        // TODO Auto-generated method stub
        return new HighPriorityConcrete();
    }

    @Override
    public String processRequest() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
