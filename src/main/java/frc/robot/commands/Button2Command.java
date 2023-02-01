// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Button2_Subsystem;

public class Button2Command extends CommandBase {
  /** Creates a new Button2Command. */
  private final Button2_Subsystem m_Button2_Subsystem;
  
  public Button2Command(Button2_Subsystem im_Button2_Subsystem) 
  {
    m_Button2_Subsystem = im_Button2_Subsystem;

    addRequirements(m_Button2_Subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    SmartDashboard.putString("Button 2 Actuated", "Button 2 is Actuated");
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
}
