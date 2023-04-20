public class App {

    //precondition:
    static boolean iWillNotCheat = true;

    //post condition:
    static boolean iWillWin = true;
    public static void main(String[] args) throws Exception {

    App myApp = new App();

    // precondition assertion
    assert iWillNotCheat == true: "Edi Yey";
     Entercompetition();
 
    //post condition assertion
    assert iWillWin == true: "Edi OK";


    System.out.println(iWillNotCheat);
    }

    static void Entercompetition() {
        iWillWin = false;

    }


}
