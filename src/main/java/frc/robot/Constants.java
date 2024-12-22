// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
//Drivetrain IDs
public final class dt_IDs {
  public static final int r_front_id = 1;
  public static final int l_front_id = 2;
  public static final int r_back_id = 3;
  public static final int l_back_id = 4;
}
//Intake IDs
public final class intake_IDs {
  public static final int l_intake_id = 5;
  public static final int r_intake_id = 6;
}
//Intake Speed
public final class Intake_speed{
public static final double intake_in_speed = .5;
public static final double intake_out_speed = -.8;

}
//Pivot IDs
public final class pivot_ids{
  public static final int l_pivot_id = 7;
  public static final int r_pivot_id = 8;
}
//Pivot Speed
public final class pivot_speed {
  public static final double pivot_up = .5;
  public static final double pivot_down = -.5;

}
}
