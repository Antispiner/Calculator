package actions;

public class MultiplyAction implements IAction {
    @Override
    public Double makeAction(Double a, Double b) {
        return a * b;
    }
}
