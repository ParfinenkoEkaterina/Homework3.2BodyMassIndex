public class Main {

        public static void main(String[] args) {
            BmiService service = new BmiService();
            double index = service.calculate(85.5, 1.68);

            System.out.println((index) + " Индекс массы тела ");
    }
}