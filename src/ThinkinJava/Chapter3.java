package ThinkinJava;


import java.util.Random;

public class Chapter3 {
    public static void main(String[] args){
//        Tank2 a1 = new Tank2();
//        Tank2 a2 = new Tank2();
//
//        a1.value = 1.01f;
//        a2.value = 2.01f;
//
//        System.out.println("a1="+a1.value+"a2="+a2.value);
//
//        a1 = a2;
//        System.out.println("a1="+a1.value+"a2="+a2.value);
//        a1.value = 1.234f;
//        System.out.println("a1="+a1.value+"a2="+a2.value);

//        Tank2 a1 = new Tank2();
//        a1.value = 3.21f;
//        System.out.println(a1.value);
//        fun x = new fun();
//        x.f(a1);
//        System.out.println(a1.value);
//        float l= 20.3f,v=1.1f;
//        float t = function.f(l,v);
//        System.out.println(t);

//        Dog a = new Dog();
//        Dog b = new Dog();
//        a.setName("spot");
//        a.setSays("Ruff");
//        b.setName("scruffy");
//        b.setSays("Wurf");
////        a.display();
////        b.display();
//
//        Dog c = new Dog();
//        c = a;
//        Dog d = new Dog();
//        d.setName("spot");
//        d.setSays("Ruff");
//        System.out.println(a==d);
//        System.out.println(a.equals(d));

//        //掷硬币
//        Random rand = new Random();
//        for(int i=0;i<100;i++){
//            int a = rand.nextInt(2);
//            if(a==0){
//                System.out.println("反  ");
//            }
//            if(a==1){
//                System.out.println("正");
//            }
//
//        }
//
//       long i = 0x12;
//       long j = 012;
//
//       System.out.println("i="+i+"二进制"+Long.toBinaryString(i));
//       System.out.println("j="+j+"二进制"+Long.toBinaryString(j));
//
//        float a =  1e-43f;
//        float fmax = Float.MAX_VALUE;
//        float fmin = Float.MIN_VALUE;
//        double dmax = Double.MAX_VALUE;
//        double dmin = Double.MIN_VALUE;
//        System.out.println(fmax);
//        System.out.println(fmin);
//        System.out.println(dmax);
//        System.out.println(dmin);

//        int a = 0xAAAA;
//        int b = 0x5555;
//        System.out.println(a&b);
//        System.out.println(Integer.toBinaryString(a&b));
//        System.out.println(a|b);
//        System.out.println(Integer.toBinaryString(a|b));
//        System.out.println(a^b);
//        System.out.println(Integer.toBinaryString(a^b));

//        int a = -1;
//        System.out.println(Integer.toBinaryString(a).length());
//        a>>>=10;
//        System.out.println(Integer.toBinaryString(a).length());
//
//        long b =-1;
//        System.out.println(Long.toBinaryString(b).length());
//        b>>>=10;
//        System.out.println(Long.toBinaryString(b).length());
//
//        short c =-1;
//        System.out.println(Integer.toBinaryString(c).length());
//        c>>>=10;
//        System.out.println(Integer.toBinaryString(c).length());
//
//        byte d = -1;
//        System.out.println(Integer.toBinaryString(d).length());
//        System.out.println(Integer.toBinaryString(d>>>10).length());

//        int a = -1;
//        a <<=10;
//        System.out.println(Integer.toBinaryString(a));
//        for(int i=0;i<32;i++){
//            a>>>=1;
//            System.out.println(Integer.toBinaryString(a));
//        }
//        char c = 'a';
//        System.out.println(Integer.toBinaryString(c));
//        c+=1;
//        System.out.println(Integer.toBinaryString(c));
//        c = 'b';
//        System.out.println(Integer.toBinaryString(c));
//
////        int x=0,y=1,z=2;
////        String s = "x,y,z";
////        System.out.println(s+x+y+z);
////        s += "sssss";
////        System.out.println(s+(x+y+z));
////        System.out.println(" "+x);
////        //int====String
////        String a = ""+x;
////        String b = Integer.toString(x);

//        int a =1;
//        long b=123131231;
//        a = (int)b;
//        b = (long)a;
        float a = 1.734f;
        System.out.println((int)a);
        System.out.println(Math.round(a));



    }



}
//class Tank2{
//    float value;
//}
//class fun{
//    static void f(Tank2 x){
//        x.value = 1.23f;
//    }
//}

//class function{
//    static float f(float l,float v){
//        if(v==0) return 0f;
//        return l/v;
//    }
//}

//class Dog{
//    String name,says;
//    void setName(String y){
//        name = y;
//    }
//    void setSays(String x){
//        says = x;
//    }
//    void display(){
//        System.out.println("名字"+name+"叫声"+says);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Dog){
//            return (this.says == ((Dog) obj).says)&&(this.says == ((Dog) obj).says);
//        }else{
//            return false;
//        }
//    }
//}

