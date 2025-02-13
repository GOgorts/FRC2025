package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CoralSubsystem;

public class OutakeCoralCommand extends Command{

    private final CoralSubsystem intakeSubsystem;
    private boolean finished;
    
    public OutakeCoralCommand(CoralSubsystem intakeSubsystem) {
        this.intakeSubsystem = intakeSubsystem;

        addRequirements(intakeSubsystem);
    }

    @Override
    public void initialize() {
        this.finished = false;
        this.intakeSubsystem.setCoralIntakeSpeed(-0.5);
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        this.finished = true;
        this.intakeSubsystem.setCoralIntakeSpeed(0);
    }

    @Override
    public boolean isFinished() {
        return this.finished;
    }
    
}
