package edu.wpi.first.wpilibj.templates.drivetrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveByJoystick extends Command{
    
    private final DriveTrain driveTrain;
    private final Joystick joystick;
    
    public DriveByJoystick(final DriveTrain driveTrain, final Joystick joystick) {
        this.driveTrain = driveTrain;
        this.joystick = joystick;
        requires(this.driveTrain);
    }

    protected void initialize() {
        
    }

    protected void execute() {
        driveTrain.arcadeDrive(joystick.getRawAxis(2), joystick.getRawAxis(4));
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        driveTrain.setSpeed(0.0);
    }

    protected void interrupted() {
        end();
    }
    
}
