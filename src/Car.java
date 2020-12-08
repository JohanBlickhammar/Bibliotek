import java.awt.*;

public abstract class Car extends Vehicle implements Turboable{
    private boolean turboOn;


    public void setTurboOn() { turboOn = true; }
    public void setTurboOff() {
        turboOn = false;
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}

