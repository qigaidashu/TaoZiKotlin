package taozi.kotlin.chapter3.objects;

public class StaticJava {
    public static void main(String... args){
        //访问kotlin中Latitude的方法和属性
//        Latitude latitude = Latitude.Companion.ofDouble(3.0);
        Latitude latitude = Latitude.ofDouble(3.0);
        Latitude latitude1 = Latitude.Companion.ofLatitude(4.0);
        Latitude latitude2 = Latitude.ofDouble(4.0);
        System.out.println(Latitude.TAG);
        System.out.println(latitude);
        System.out.println(latitude1);
        System.out.println(latitude2);
    }
}
