package edu.wpi.first.wpilibj.templates.drivetrain;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.templates.InvertibleSpeedController;
import edu.wpi.first.wpilibj.templates.SpeedControllerGroup;

public class BasicDriveTrainComponents implements DriveTrainComponents {
    
    private final InvertibleSpeedController leftMaster;
    private final InvertibleSpeedController leftSlave;
    private final InvertibleSpeedController leftSpeedController;
    private final InvertibleSpeedController rightMaster;
    private final InvertibleSpeedController rightSlave;
    private final InvertibleSpeedController rightSpeedController;
    private final RobotDrive robotDrive;
    public BasicDriveTrainComponents() {
        leftMaster = new InvertibleSpeedController(new Talon(7));
        leftSlave = new InvertibleSpeedController(new Talon(8));
        SpeedController[] leftArr = {leftMaster};
        leftSpeedController = new InvertibleSpeedController(new SpeedControllerGroup(leftArr));
        rightMaster = new InvertibleSpeedController(new Talon(9));
        rightSlave = new InvertibleSpeedController(new Talon(10));
        SpeedController[] rightArr = {rightMaster};
        rightSpeedController = new InvertibleSpeedController(new SpeedControllerGroup(rightArr));
        robotDrive = new RobotDrive(leftSpeedController, rightSpeedController);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, false);
        
    }

    public SpeedController getRightSpeedController() {
        return rightSpeedController;
    }

    public SpeedController getLeftSpeedController() {
        return leftSpeedController;
    }

    public RobotDrive getRobotDrive() {
        return robotDrive;
    }
    
}
