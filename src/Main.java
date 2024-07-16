//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        int weight = 88;
        int index = service.calculate(height, weight);
        System.out.println(index);
    }
}