public abstract class Computer {
    public abstract void Start();
    public abstract void TurnOff();
}

public class Personal extends Computer {
    @Override
    public void Start() {
        System.out.println("PC: Power button pressed");
    }
    
    @Override
    public void TurnOff() {
        System.out.println("PC: Turn off");
    }
}

public class Laptop extends Computer {
    @Override
    public void Start() {
        System.out.println("Laptop: Opening lid and pressing power");
    }
    
    @Override
    public void TurnOff() {
        System.out.println("Laptop: Closing lid or Turn off");
    }
    
    public void charge() {
        System.out.println("Laptop: Charging battery");
    }
}