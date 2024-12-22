// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Pivot extends SubsystemBase {
  /** Creates a new Pivot. */
  //Creating the Motors
  CANSparkMax l_pivot;
  CANSparkMax r_pivot;
  public Pivot() {
    //Defining the Motors
   CANSparkMax l_pivot = new CANSparkMax(Constants.pivot_ids.l_pivot_id, MotorType.kBrushless);
   CANSparkMax r_pivot = new CANSparkMax(Constants.pivot_ids.r_pivot_id, MotorType.kBrushless);

   //Setting the IdleMode
   l_pivot.setIdleMode(IdleMode.kBrake);
   r_pivot.setIdleMode(IdleMode.kBrake);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void pivot_move(double pivot_speed){
    l_pivot.set(pivot_speed);
    r_pivot.set(pivot_speed);

  }
}
