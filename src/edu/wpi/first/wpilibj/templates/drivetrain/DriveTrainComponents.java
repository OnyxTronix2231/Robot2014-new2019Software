package edu.wpi.first.wpilibj.templates.drivetrain;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

public interface DriveTrainComponents {
    SpeedController getRightSpeedController();
    SpeedController getLeftSpeedController();
    RobotDrive getRobotDrive();
}
