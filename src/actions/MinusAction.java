package actions;

public class MinusAction implements IAction {
    @Override
    public Double makeAction(Double a, Double b) {
        return a - b;
    }
}
