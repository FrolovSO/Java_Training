import tech.TechName;
import tech.interfaces.KitchenTech;

public class Main {

    public static void main(String[] args) {

        KitchenTech techOne = new KitchenTech(TechName.REF, 100,200);
        KitchenTech techSecond = new KitchenTech(TechName.WACHER, 100,100);
        KitchenTech techThod = new KitchenTech(TechName.TV, 300,100);
        techOne.setBroken(true);
        System.out.println("Check " + techOne.getName().toString() + " is Fit 200 200 =" + techOne.isFix(200,200) + " is Valid= " + techOne.isValid());
        System.out.println("Check " + techSecond.getName().toString() + " is Fit 200 200 =" + techSecond.isFix(200,200) + " is Valid= " + techSecond.isValid());
        System.out.println("Check " + techThod.getName().toString() + " is Fit 200 200 =" + techThod.isFix(200,200) + " is Valid= " + techThod.isValid());


        //1. Create an abstract class that will be a generic
        //2. Inherit from this class
        //3. Implement 2 interfaces
        //4. Create your enam and use it as a class field
        //5. Levels of hierarchy 2 (at one level 4 objects)
        // 6. In ename sodat method by analogy
        // 7. Packet separation
        // Topic: household appliances
    }
}
