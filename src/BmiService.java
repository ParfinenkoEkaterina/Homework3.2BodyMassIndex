public class BmiService {

 public float calculate(double weight, double height) {

     double index = weight / height;


     return (float) index;
 }
}
