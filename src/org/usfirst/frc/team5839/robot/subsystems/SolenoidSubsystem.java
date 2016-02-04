package org.usfirst.frc.team5839.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SolenoidSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private DoubleSolenoid doubleSolenoid;
	
	public SolenoidSubsystem() {
		// TODO Auto-generated constructor stub
		doubleSolenoid = new DoubleSolenoid(20, 0, 1);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void forward(){
    	doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void reverse(){
    	doubleSolenoid.set(Value.kReverse);
    }
    
    public void off(){
    	doubleSolenoid.set(Value.kOff);
    }
}

