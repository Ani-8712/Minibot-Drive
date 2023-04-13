// Copyright (c) FIRST and other WPILib contributors.
package frc.robot.Constants;

import edu.wpi.first.math.util.Units;

public class Constants {
    public static final int leftPin = 1;
    public static final int rightPin = 2;
    public static final double kDegreesToTicks = (60 / 14) * 2048;
    public static final double kTicksToDegrees = (1 / 2048) * (14 / 60);
    public static final double kTickstoMeters = ((60 / 14) * 2048 * 360)
            * (0.1 * (Units.inchesToMeters(4)) * 2 * Math.PI);
    public static final double kMetersToTicks = 1
            / (((60 / 14) * 2048 * 360) * (Units.inchesToMeters(4) * 2 * Math.PI));
}
