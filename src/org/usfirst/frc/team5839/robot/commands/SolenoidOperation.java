package org.usfirst.frc.team5839.robot.commands;

import org.usfirst.frc.team5839.robot.Robot;
import org.usfirst.frc.team5839.robot.subsystems.SolenoidSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SolenoidOperation extends Command {
	
	SolenoidSubsystem subsystem = Robot.solenoidSubsystem;

	Direction direction;
	
	public static enum Direction {
		FORWARD,
		REVERSE,
		OFF
	}
	

    public SolenoidOperation(Direction direction) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.solenoidSubsystem);
    	this.direction = direction;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	switch (direction) {
		case FORWARD:
			subsystem.forward();
			break;
		case REVERSE:
			subsystem.reverse();
			break;
		case OFF:
			subsystem.off();
			break;

		default:
			break;
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
