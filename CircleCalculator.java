package Cal;

public class CircleCalculator extends Calculator<Double>{

    //원이 넓이
    @Override
    public Double calculateCircleArea(Double r){
        double area = r*r*PI;
        setCircleArea(area);
        setCircleList(getCircleArea());
        return area;
    }
}
