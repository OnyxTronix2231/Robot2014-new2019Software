package edu.wpi.first.wpilibj.templates.drivetrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {    

    private final DriveTrainComponents components;
    private final Joystick joystick;
    
    public DriveTrain(final DriveTrainComponents components, final Joystick joystick) {
        this.components = components;
        this.joystick = joystick;
    }
    
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveByJoystick(this, joystick));
    }
    
    public void arcadeDrive(double speed, double angle) {
        components.getRobotDrive().arcadeDrive(speed, angle);
    }
    
    public void setSpeed(double speed) {
        components.getLeftSpeedController().set(speed);
        components.getRightSpeedController().set(speed);
    }
}
