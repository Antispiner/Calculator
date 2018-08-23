package actions;

public class DivideAction implements IAction {
    @Override
    public Double makeAction(Double a, Double b) {
        return a / b;
    }
}
