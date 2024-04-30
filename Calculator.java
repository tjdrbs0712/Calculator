package Cal;

import java.util.*;

public abstract class Calculator<T extends Number> {
    protected ArrayList<T> resultList = new ArrayList<>();
    protected T result;

    protected ArrayList<Double> circleList = new ArrayList<>();
    final static double PI = Math.PI;
    protected double circleArea;

    //사칙연산 결과 값 가져오기
    public T getResult() {
        return this.result;
    }
    //사칙연산 결과 값 입력
    public void setResult(T result) {
        this.result = result;
    }
    //사칙연산 결과 값 리스트 가져오기
    public ArrayList<T> getResultList() {
        return this.resultList;
    }
    //사칙연산 결과 값 리스트에 추가하기
    public void setResultList(T result) {
        this.resultList.add(result);
    }
    //원의 넓이 가져오기
    public double getCircleArea(){
        return this.circleArea;
    }
    //원의 넓이 입력
    public void setCircleArea(double circleArea){
        this.circleArea = circleArea;
    }
    //원의 넓이 리스트 가져오기
    public ArrayList<Double> getCircleList(){
        return this.circleList;
    }
    //원의 넓이 추가하기
    public void setCircleList(Double circleArea){
        this.circleList.add(circleArea);
    }
    //사칙연산 값 지우기
    public void removeResult(){
        resultList.remove(0);
    }
    //사칙연산 값 전체 출력
    public void inquiryResult(){
        System.out.println(resultList.toString());
    }

    //원의 넓이 메서드
    public Double calculateCircleArea(Double r){
        return 0d;
    }

    //사칙연산 메서드
    public void calculate(T f, T s, char o) throws Exception{}

    //입력 받은 값보다 큰 값들 출력
    public List<Double> compareValue(Double v){
        return new ArrayList<>();
    }
}
