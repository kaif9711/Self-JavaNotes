class method_overriding_2 {
    Object show() {
        System.out.println("1");
        return null;
    }

}
class Xyz extends method_overriding_2 {
    String show() {
        System.out.println("2");
        return null;
    }

    public static void main(String[] args){
        method_overriding_2 obj0 = new method_overriding_2();
        obj0.show();
        method_overriding_2 obj1 = new Xyz();
        obj1.show();


    }
}
