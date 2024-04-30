package Cal;

public class ModOperator implements Operator<Double> {

    @Override
    public Double operate(Double f, Double s){
        return f % s;
    }
}
