// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  //Creating Motors
  CANSparkMax l_shooter;
  CANSparkMax r_shooter;

  /** Creates a new Shooter. */
  public Shooter() {
    //Defining the Motors
    CANSparkMax l_shooter = new CANSparkMax(Constants.shooter_IDs.l_shooter_ID, MotorType.kBrushless);
    CANSparkMax r_shooter = new CANSparkMax(Constants.shooter_IDs.r_shooter_ID, MotorType.kBrushless);

    //Setting Idle Mode
    l_shooter.setIdleMode(IdleMode.kBrake);
    r_shooter.setIdleMode(IdleMode.kBrake);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void shooter_shoot(double shooter_speed) {
    l_shooter.set(shooter_speed);
    r_shooter.set(shooter_speed);

  }
}
