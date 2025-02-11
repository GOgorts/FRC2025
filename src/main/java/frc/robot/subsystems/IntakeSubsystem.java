package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    
    //Initalize SparkMaxes
    private final SparkMax coralIntakeMotor;
    public static final int kCoralIntakeCanId = 9;

    private final SparkMax coralRotMotor;
    public static final int kCoralRotMotor = 10;

    public IntakeSubsystem() {
        this.coralIntakeMotor = new SparkMax(kCoralIntakeCanId, MotorType.kBrushless);
        this.coralRotMotor = new SparkMax(kCoralRotMotor, MotorType.kBrushless);
    }

    public void setCoralIntakeSpeed(double speed) {
        coralIntakeMotor.set(speed);
    }

    public void setCoralRotSpeed(double speed) {
        coralRotMotor.set(speed);
    }


}
