package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Controllers{

   public static TalonFX leftDrive1 = new TalonFX(RobotMap.leftDriveID1);
   public static TalonFX leftDrive2 = new TalonFX(RobotMap.leftDriveID2);
   public static TalonFX leftDrive3 = new TalonFX(RobotMap.leftDriveID3);
   public static TalonFX rightDrive1 = new TalonFX(RobotMap.rightDriveID1);
   public static TalonFX rightDrive2 = new TalonFX(RobotMap.leftDriveID2);
   public static TalonFX rightDrive3 = new TalonFX(RobotMap.rightDriveID3);

   public static CANSparkMax leftSwerve1 = new CANSparkMax(RobotMap.leftSwerveID1, MotorType.kBrushless);
   public static CANSparkMax leftSwerve2 = new CANSparkMax(RobotMap.leftSwerveID2, MotorType.kBrushless);
   public static CANSparkMax leftSwerve3 = new CANSparkMax(RobotMap.leftSwerveID3, MotorType.kBrushless);
   public static CANSparkMax rightSwerve1 = new CANSparkMax(RobotMap.rightSwerveID1, MotorType.kBrushless);
   public static CANSparkMax rightSwerve2 = new CANSparkMax(RobotMap.leftSwerveID2, MotorType.kBrushless);
   public static CANSparkMax rightSwerve3 = new CANSparkMax(RobotMap.rightSwerveID3, MotorType.kBrushless);


}