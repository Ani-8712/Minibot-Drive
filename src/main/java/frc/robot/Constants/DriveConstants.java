package frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;


public class DriveConstants {
    public static final TalonFX left = new TalonFX(Constants.leftPin);
    public static final TalonFX right = new TalonFX(Constants.rightPin);

    public static final TalonFXConfiguration kMasterConfig = new TalonFXConfiguration();



    static{
        //configures PIDF for kMasterConfig 
        kMasterConfig.slot0.kP = 0;
        kMasterConfig.slot0.kI = 0;
        kMasterConfig.slot0.kD = 0;
        kMasterConfig.slot0.kF = 0;
        
        //applies config object to the motor
        left.configAllSettings(kMasterConfig, 0);//CHANGE DELAY TO SMTHING MEANINGFULL
        right.configAllSettings(kMasterConfig, 0);
    }
}
