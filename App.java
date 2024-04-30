package Cal;

import java.util.*;

public class App {

    static Calculator<Double> cal1 = new CircleCalculator();
    static Calculator<Double> cal2 = new ArithmeticCalculator();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("1.사칙연산, 2.원의 넓이, 3.입력한 값보다 큰 결과 값");
                int select = sc.nextInt();

                switch(select){
                    case 1 -> arithmeticOperation();
                    case 2 -> calculateCircleArea();
                    case 3 -> printValuesGreaterThan();
                    default -> {
                        System.out.println("잘못입력하셨습니다.");
                        continue;
                    }
                }
                if(!continueCalculate()) break;

            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

    public static void arithmeticOperation() throws Exception{

        Double firstNumber = getDoubleInput("첫 번째 숫자를 입력하세요: ");
        Double secondNumber = getDoubleInput("두 번째 숫자를 입력하세요: ");
        char operator = getCharInput("사칙연산 기호를 입력하세요: ");
        cal2.calculate(firstNumber, secondNumber, operator);
        System.out.println("결과: " + cal2.getResult());

        manage();
    }

    public static void manage(){
        //계산 결과 삭제
        sc.nextLine();
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String re = sc.nextLine();
        if (re.equals("remove")) {
            cal2.removeResult();
        }

        //계산 결과 조회
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String in = sc.nextLine();
        if (in.equals("inquiry")) {
            cal2.inquiryResult();
        }
    }

    // 원의 넓이
    public static void calculateCircleArea(){
        Double r = getDoubleInput("반지름: ");
        double circleArea = cal1.calculateCircleArea(r);
        System.out.println("원의 넓이: " + String.format("%.1f", circleArea));

        System.out.println("저장된 원의 넓이");
        ArrayList<Double> circleList = cal1.getCircleList();
        for(Double v : circleList){
            System.out.printf("%.1f%n", v);
        }
        sc.nextLine();
    }

    // 입력 받은 값보다 더 큰 값 출력
    public static void printValuesGreaterThan(){

        Double v = getDoubleInput("입력: ");
        List<Double> list = cal2.compareValue(v);
        for(Double value:list){
            System.out.println(value);
        }
        System.out.println();
    }

    //계속 계산
    public static boolean continueCalculate(){
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        String ex = sc.nextLine();
        return !ex.equals("exit");
    }

    //값 입력
    public static Double getDoubleInput(String m){
        System.out.print(m);
        while (!sc.hasNextDouble()) {
            System.out.println("숫자를 입력하세요.");
            sc.next();
        }
        double number = sc.nextDouble();
        sc.nextLine();

        return number;
    }
    //연산자 입력
    public static char getCharInput(String m){
        System.out.println(m);
        return sc.next().charAt(0);
    }

}
