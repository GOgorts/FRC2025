package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
        
    //Initalize SparkMaxes
    private final SparkMax elevatorSparkMax;
    public static final int kElevatorCanId = 12;
    
    public ElevatorSubsystem() {
        this.elevatorSparkMax = new SparkMax(kElevatorCanId, MotorType.kBrushless);
    }

    public void setElevatorSpeed(double speed) {
        this.elevatorSparkMax.set(speed);
    }

}


