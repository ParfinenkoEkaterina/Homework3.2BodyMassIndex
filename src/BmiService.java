public class BmiService {

 public float calculate(double a, double b) {

     double weight = a;
     double height = b;

     double index = weight / height;


     return (float) index;
 }
}
