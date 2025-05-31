package FactoryPattern;

public class MediumPriorityConcreteCreator implements RequestCreator{

    @Override
    public RequestProduct createRequest() {
        return new MediumPriorityConcrete();
    }

    @Override
    public String processRequest() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
