package actions;

public class PlusAction implements IAction{
    @Override
    public Double makeAction(Double a, Double b) {
        return a + b;
    }
}
