package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.SpeedController;

public class InvertibleSpeedController implements SpeedController {

    private final SpeedController speedController;
    private boolean inverted;
    public InvertibleSpeedController(SpeedController speedController) {
        this.speedController = speedController;
        inverted = false;
    }
    
    public double get() {
        return inverted ? speedController.get() * -1 : speedController.get();
    }

    public void set(double d, byte b) {
        speedController.set(inverted ? -d : d, b);
    }

    public void set(double d) {
        speedController.set(inverted ? -d : d);
    }

    public void disable() {
        speedController.disable();
    }

    public void pidWrite(double d) {
        pidWrite(d);
    }
    
    public void setInverted(boolean inverted) {
        this.inverted = inverted;
    }
    
    public boolean getInverted() {
        return inverted;
    }
}
