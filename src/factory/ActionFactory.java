package factory;

import actions.*;

public enum  ActionFactory {

    DIVIDE  {
        @Override
        public IAction getAction(){
            return new DivideAction();
        }
    },
    MINUS {
        @Override
        public IAction getAction(){
            return new MinusAction();
        }
    },
    MULTIPLY{
        @Override
        public IAction getAction(){
            return new MultiplyAction();
        }
    },
    PLUS {
        @Override
        public IAction getAction() {
            return new PlusAction();
        }
    };

    public abstract IAction getAction();
}
