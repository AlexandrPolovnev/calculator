package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/calculator")

public class Controller {
    private final CalculatorService calculatorService;

    public Controller (CalculatorService calculatorService){
      this.calculatorService = calculatorService;
    }

    @GetMapping ()
    public String helloC (){
        return calculatorService.helloC();
    }

    @GetMapping(path="/plus")
    public String sumNumbers(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return  num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }

    @GetMapping(path="/minus")
    public String minusNumbers(@RequestParam (required = true) int num1, @RequestParam (required = true)int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.subtraction(num1, num2);
    }

    @GetMapping(path="/multiply")
    public String multiplyNumbers(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping(path="/divide")
    public Object divideNumbers(@RequestParam (required = true)int num1, @RequestParam (required = true)int num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно";
        }
        return num1 + " / " + num2 + " = " + calculatorService.share(num1, num2);
    }
}