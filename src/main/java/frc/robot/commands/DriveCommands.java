package frc.robot.commands;

import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.Drivetrain;

public class DriveCommands extends CommandBase {

    private Drivetrain m_drivetrain;

    public DriveCommands(Drivetrain drvtrn) {

        this.m_drivetrain = drvtrn;
        addRequirements(this.m_drivetrain);// why do we do this? idk. Maybe I'll find out soon. Just use the good ol'ask
                                           // Edward or Mikita
        // UPDATE: it's there so the subsystem can be entered into the
        // commandSchenduler, preventing 2 commands from using the same subystem

        // it only took 6 months

    }

    public Command go(double leftSpeed, double rightSpeed/* if 1, turn left | if 0, no turn | if -1, turn right */,
            Drivetrain dt) {
        return new Command() {
            @Override
            public Set<Subsystem> getRequirements() {
                // TODO Auto-generated method stub
                return m_requirements;
            }

            @Override
            public void initialize() {
                dt.brakeMotors();
            }

            @Override
            public void execute() {
                dt.setLeftSpeed(leftSpeed);
                dt.setRightSpeed(rightSpeed);
            }

        };
    }

}
