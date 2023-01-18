class DemoNonstatic {

    int y = 25;

    void disp() {
        System.out.println("running disp() method");
    }
}

class Mainclass2 {
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("y value is " + new DemoNonstatic().y);
        new DemoNonstatic().disp();
        System.out.println("main method ended");
    }
}
