package Cal;

public class AddOperator implements Operator<Double>{

    @Override
    public Double operate (Double f, Double s){
        return f + s;
    }
}
