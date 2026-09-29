public class OperatorsDemo {

    void add(int a , int b) {
        int sum = a+b;
        System.out.println("Addition:"+sum);
    }

    //Method with retun
    int multiply(int a , int b) {
        return a*b;

    }

    public static void main(String[]args){

        //operators
        int x = 20,y = 3;
        System.out.println("x+y ="+(x+y));
        System.out.println("x-y ="+(x-y));
        System.out.println("x*y ="+(x*y));
        System.out.println("x/y ="+(x/y));
        System.out.println("x%y ="+(x%y));

        //Arithmatic Pramotion
        byte a = 25,b = 10;
        int result = a + b;
        System.out.println("Addition of a and b :"+result);

        //method calling

        OperatorsDemo obj = new OperatorsDemo();
        obj.add(10,20);
        int product = obj.multiply(5,5);
        System.out.println("Multiplication:" +product);

    }
}
