import Explorers.*;
import Planets.*;

public class App {
public static void main(String[] args) {


Planet mars = new Mars();
Planet saturn = new Saturn();
Planet mercury = new Mercury();
Planet venus = new Venus();
Planet earth = new Earth();
Planet jupiter = new Jupiter();
Planet uranus = new Jupiter();
Explorer astronaut = new HumanExplorer();
Explorer rover = new RobotExplorer();


mars.accept(astronaut);
saturn.accept(astronaut);
mercury.accept(astronaut);
venus.accept(astronaut);
earth.accept(astronaut);
jupiter.accept(astronaut);
uranus.accept(astronaut);
}
}
