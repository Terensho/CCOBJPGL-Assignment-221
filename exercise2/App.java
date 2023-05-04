import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet mars = new Mars();
        Planet jupiter = new Jupiter();
        Planet saturn = new Saturn();
        Planet uranus = new Uranus();
        Planet neptune = new Neptune();
        Planet pluto = new Pluto();






        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        uranus.accept(astronaut);
        jupiter.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        neptune.accept(astronaut);
        pluto.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        uranus.accept(rover);
        jupiter.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        neptune.accept(rover);
        pluto.accept(rover);
    }
}
