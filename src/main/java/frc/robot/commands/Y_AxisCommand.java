// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Y_Axis_Subsystem;
public class Y_AxisCommand extends CommandBase {
  /** Creates a new Button2Command. */
  private final Y_Axis_Subsystem m_Y_Axis_Subsystem;
  
  public Y_AxisCommand(Y_Axis_Subsystem iY_Axis_Subsystem) 
  {
    m_Y_Axis_Subsystem = iY_Axis_Subsystem;

    addRequirements(m_Y_Axis_Subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
 //   SmartDashboard.putString("Y Axis", RobotContainer.m_APAC_Board.getRawAxis(1));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {
    SmartDashboard.putString("Button 2 Actuated", "Button 2 is NOT Actuated");
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
  public static void main(String []args){
 //   System.out.println( RobotContainer.getYAxis());
  }
}
