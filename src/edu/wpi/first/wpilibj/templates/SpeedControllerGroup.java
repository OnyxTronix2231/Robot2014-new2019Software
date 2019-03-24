package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.SpeedController;

public class SpeedControllerGroup implements SpeedController{

    private final SpeedController[] speedControllers;
    
    public SpeedControllerGroup(final SpeedController[] speedControllers) {
        this.speedControllers = speedControllers;
    } 
    
    public double get() {
        return speedControllers[0].get();
    }

    public void set(double d, byte b) {
        for(int i = 0; i < speedControllers.length; ++i) {
            speedControllers[i].set(d, b);
        }
    }

    public void set(double d) {
        for(int i = 0; i < speedControllers.length; ++i) {
            speedControllers[i].set(d);
        }
    }

    public void disable() {
        for(int i = 0; i < speedControllers.length; ++i) {
            speedControllers[i].disable();
        }
    }

    public void pidWrite(double d) {
        for(int i = 0; i < speedControllers.length; ++i) {
            speedControllers[i].pidWrite(d);
        }
    }
}
