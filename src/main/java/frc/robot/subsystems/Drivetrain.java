package frc.robot.subsystems;

import java.util.function.DoubleSupplier;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Constants;

public class Drivetrain extends SubsystemBase {
    private double lSpeed;
    private double rSpeed;
    private TalonFX right;
    private TalonFX left;

    public Drivetrain(TalonFX l, TalonFX r) {
        this.lSpeed = 0;
        this.rSpeed = 0;
        this.right = r;
        this.left = l;
    }

    public void periodic() {
        this.right.set(ControlMode.Velocity, this.rSpeed * Constants.kMetersToTicks);
        this.left.set(ControlMode.Velocity, this.lSpeed * Constants.kMetersToTicks);

    }

    // sets speed for left
    public void setLeftSpeed(double sped) {
        this.lSpeed = sped;
    }

    // sets speed for right
    public void setRightSpeed(double sped) {
        this.rSpeed = sped;
    }

    // gets encoder ticks for right motor
    public double getRightEncoderTicks() {
        return right.getSelectedSensorPosition();
    }

    // gets encoder ticks for left motor
    public double getLeftEncoderTicks() {
        return left.getSelectedSensorPosition();
    }

    public double getLeftDegs() {
        return this.getLeftEncoderTicks() * Constants.kTickstoMeters;
    }

    public double getRightDegs() {
        return this.getRightEncoderTicks() * Constants.kTickstoMeters;
    }

    public void brakeMotors() {
        left.setNeutralMode(NeutralMode.Brake);
        right.setNeutralMode(NeutralMode.Brake);
    }

}
