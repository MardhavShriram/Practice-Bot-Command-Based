// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  //Drivetrain Motors
  CANSparkMax f_right;
  CANSparkMax b_right;
  CANSparkMax f_left;
  CANSparkMax b_left;

  //Joysticks
  Joystick l_joystick;
  Joystick r_joystick;

  //Directional variables
  double ly;
  double rx;
  public DriveTrain() {
  //Defining the Joysticks with Ports
  l_joystick = new Joystick(1);
  r_joystick = new Joystick(2);

  //Defining the Drivetrain Motors
  f_right = new CANSparkMax(Constants.dt_IDs.r_front_id, MotorType.kBrushless);
  b_right = new CANSparkMax(Constants.dt_IDs.r_back_id, MotorType.kBrushless);
  f_left = new CANSparkMax(Constants.dt_IDs.l_front_id, MotorType.kBrushless);
  b_left = new CANSparkMax(Constants.dt_IDs.l_back_id, MotorType.kBrushless);

  //Set the Motors Idlemode
  f_right.setIdleMode(IdleMode.kBrake);
  b_right.setIdleMode(IdleMode.kBrake);
  f_left.setIdleMode(IdleMode.kBrake);
  b_left.setIdleMode(IdleMode.kBrake);

  //Set the Back motors to follow the front
  b_right.follow(f_right);
  b_left.follow(f_left);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  //Method for Drivetrain Values
  public void arcade_drive(Joystick l_joystick, Joystick r_joystick){
    rx = r_joystick.getX();
    ly = -l_joystick.getY();

    f_right.set(ly-rx);
    f_left.set(ly+rx);
  }
}
