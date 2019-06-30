package ThinkinJava;

public class Chapter2 {



    public static void main(String[] args){

        //        DataOnly s = new DataOnly();
//        s.i = 1;
//        s.d = 1.02;
//        s.b = true;
//        s.show();

//        Storage s = new Storage();
//        System.out.println("hi");
//        System.out.println(StaticTest.i);
//        StaticTest s1 = new StaticTest();
//        StaticTest s2 = new StaticTest();
//        System.out.println(s1.i);
//        System.out.println(s1.i);
//        Increment i1 = new Increment();
//        i1.increm();
//        System.out.println("incream");
//        System.out.println(s1.i);
//        System.out.println(s1.i);
//        System.out.println("incream2");
//        Increment.increm();
//        System.out.println(s1.i);
//        System.out.println(s1.i);
//        char a = 'x';
//        int b =1;
//        boolean c = true;
//        byte d = 8;
//        short e = 3;
//        long f = 100;
//        double g = 1.12;
//        float h = 1.0001f;
//
//        Character a1 = new Character('x');
//        System.out.println(a==a1);
//
//        Integer b1 = b;
//
//        Boolean c1 = c;
//
//        Byte d1 = d;
//        Short e1 = e;
//
//        Long f1 = new Long(100);
//        System.out.println(f==f1);
//
//        System.out.println(h);

        AllTheColorsOfTheRainbow r = new AllTheColorsOfTheRainbow();
        r.changeColor(12);







    }
}

//        class DataOnly{
//            int i ;
//            double d;
//            boolean b;
//            void show() {
//                System.out.println(i);
//                System.out.println(d);
//                System.out.println(b);
//            }
//        }

//class Storage{
//
//    int show(String s){
//        return s.length()*2;
//    }
//
//}

//class StaticTest{
//    static int i = 47;
//}
//class Increment{
//    static void increm(){
//        StaticTest.i++;
//    }
//}

class AllTheColorsOfTheRainbow{
    int anColor=0;
    void changeColor(int newColor){
        anColor =newColor;
    }

}



