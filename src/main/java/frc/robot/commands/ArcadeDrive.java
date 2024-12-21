// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends Command {
  /** Creates a new ArcadeDrive. */

  //Announce DriveTrain
  DriveTrain dt; 

  //Announce Joysticks
  Joystick l_joystick;
  Joystick r_joystick;

  public ArcadeDrive(DriveTrain dt_import, Joystick l_joystick_import, Joystick r_joystick_import) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.dt = dt_import;
    addRequirements(this.dt);
    this.l_joystick = l_joystick_import;
    this.r_joystick = r_joystick_import;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    this.dt.arcade_drive(this.l_joystick, this.r_joystick);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
