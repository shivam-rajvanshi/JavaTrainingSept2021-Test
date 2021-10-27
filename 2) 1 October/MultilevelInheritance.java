
class Television {
    public void onOff() {
        System.out.println("Television has the property of Switch on and off");
    }
}

class LED extends Television {
    public void thinDisplay() {
        System.out.println("LED has the property of Thin Display");
    }
}

class SmartTv extends LED {
    public void internet() {
        System.out.println("SmartTv has the property of Internet");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        SmartTv tv = new SmartTv();
        tv.onOff();
        tv.thinDisplay();
        tv.internet();

    }

}
