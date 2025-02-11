package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    
    //Initalize SparkMaxes
    private final SparkMax coralIntakeMotor;
    public static final int kCoralIntakeCanId = 9;



    public IntakeSubsystem() {
        
        this.coralIntakeMotor = new SparkMax(kCoralIntakeCanId, MotorType.kBrushless);
    }

    public void setCoralIntakeSpeed(double speed) {
        this.coralIntakeMotor.set(speed);
    }


}
