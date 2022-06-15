public class BmiService {
    public float calculate(float weight, float height){
        float h2 = height * height;
        float bmi = weight / h2;
        return bmi;
    }
}
