package FactoryPattern;

public class LowPriorityConcreteCreator implements RequestCreator{

    @Override
    public RequestProduct createRequest() {
        return new LowPriorityConcrete();
    }

    @Override
    public String processRequest() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
