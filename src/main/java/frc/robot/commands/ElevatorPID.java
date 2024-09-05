package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Elevator;

public class ElevatorPID extends Command{
    private Elevator elevator;
    
    public ElevatorPID(){
        this.elevator = Elevator.getSystem();

        addRequirements(this.elevator);
    }

    @Override
    public void execute() {
        elevator.pid();
    }
}