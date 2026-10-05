interface MyCamera {
    void takingSnap();

    void recordVideo();

    private void greet(){
        System.out.println("GOOD MORINING");
    }//This private method can not be used outside this interface but can be used inside.
    default void RecordingIn4K() {
        greet();
        System.out.println("Recording in 4K");
    }
}

interface MyWifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void takingSnap() {
        System.out.println("Taking snap...");
    }

    void callNumner(long number) {
        System.out.println("Calling" + number);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}

class mySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
    public void takingSnap() {
        System.out.println("Taking snap...");
    }

    public void recordVideo() {
        System.out.println("Recording video...");
    }

    public String[] getNetwork() {
        System.out.println("Getting list of networks...");
        String[] networkList = { "Samsung M21", "Airtel Harry", "Jio Fiber 5g" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

}

public class DefaultMethods {
    public static void main(String[] args) {
        mySmartPhone sm = new mySmartPhone();
        String[] arr = sm.getNetwork();
        for (String network : arr) {
            System.out.println(network);
        }
        sm.RecordingIn4K();
    }
}
