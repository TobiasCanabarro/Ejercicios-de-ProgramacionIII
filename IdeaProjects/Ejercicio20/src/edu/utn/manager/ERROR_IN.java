package edu.utn.manager;

public enum ERROR_IN {
    NAME(0), PRODUCTION_COST(1), OBSERVATION(2), OK(10);

    private int errorOut;

    ERROR_IN (int errorOut){
        setErrorOut(errorOut);
    }

    public int getErrorOut () {
        return errorOut;
    }

    public void setErrorOut (int errorOut) {
        this.errorOut = errorOut;
    }
}
