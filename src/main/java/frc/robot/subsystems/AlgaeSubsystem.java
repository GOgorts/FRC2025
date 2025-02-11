package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AlgaeSubsystem extends SubsystemBase {

    //Initalize SparkMaxes
    private final SparkMax algaeIntakeMotor;
    public static final int kAlgaeIntakeMotor = 11;

    public AlgaeSubsystem() {
        this.algaeIntakeMotor = new SparkMax(kAlgaeIntakeMotor, MotorType.kBrushless);
    }

    public void setAlgaeIntakeSpeed(double speed) {
        algaeIntakeMotor.set(speed);
    }


} 
