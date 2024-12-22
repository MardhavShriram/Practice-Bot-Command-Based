// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  //Creating Intake Motors
  CANSparkMax l_intake;
  CANSparkMax r_intake;

  public Intake() {
    //Defining the Motors
    CANSparkMax l_intake = new CANSparkMax(Constants.intake_IDs.l_intake_id, MotorType.kBrushless);
    CANSparkMax r_intake = new CANSparkMax(Constants.intake_IDs.r_intake_id, MotorType.kBrushless);

    //Setting the Idle Mode
    l_intake.setIdleMode(IdleMode.kBrake);
    r_intake.setIdleMode(IdleMode.kBrake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intake_spin (double intake_speed){

    l_intake.set(intake_speed);
    r_intake.set(intake_speed);

  }
}
