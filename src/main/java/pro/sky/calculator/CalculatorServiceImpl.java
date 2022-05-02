package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String helloC() {
        return "<b> Добро пожаловать в калькулятор </b>";
    }
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int share(int num1, int num2) {
        return num1 / num2;
    }
}
