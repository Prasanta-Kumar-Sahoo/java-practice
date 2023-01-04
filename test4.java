import javax.sound.sampled.SourceDataLine;

import operation.rectangle;

public class test4 {
    public static void main(String[] args) {
        rectangle obj = new rectangle();
        double Area, Perimeter, Volume;
        Area = obj.area(6, 7);
        Perimeter = obj.perimeter(6, 7);
        Volume = obj.volume(6, 7, 9);
        System.out.println("the Area is" + Area);
        System.out.println("the peremeter is" + Perimeter);
        System.out.println("the Volume is" + Volume);
    }
}
