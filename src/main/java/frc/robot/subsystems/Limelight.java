// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Limelight extends SubsystemBase {

  double tx;
  double ty;

  public Limelight() {}

  @Override
  public void periodic() 
  {
    tx = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tx").getDouble(0);
    ty = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ty").getDouble(0);

   SmartDashboard.putNumber("tx", tx);
   SmartDashboard.putNumber("ty", ty);



    // how many degrees back is your limelight rotated from perfectly vertical?
    double limelightMountAngleDegrees = 0;

    // distance from the center of the Limelight lens to the floor
    double limelightLensHeightInches = 24.0;

    // distance from the target to the floor
    double goalHeightInches = 23.5;
    

    double angleToGoalDegrees = limelightMountAngleDegrees + ty;
    double angleToGoalRadians = angleToGoalDegrees * (3.14159 / 180.0);

    //calculate distance
    double distanceFromLimelightToGoalInches = (goalHeightInches - limelightLensHeightInches)/Math.tan(angleToGoalRadians);

    SmartDashboard.putNumber("distanceToGoalInches" ,distanceFromLimelightToGoalInches );  }
}
