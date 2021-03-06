package frc.robot.subsystems;

import edu.wpi.first.networktables.*;

public class Vision {
    private NetworkTable table;
    public Vision() {
        table=NetworkTableInstance.getDefault().getTable("limelight");
        NetworkTableInstance.getDefault().getTable("limelight").getEntry("<variablename>").setNumber(1);
    }

    public double getAngleX() {
        return table.getEntry("tx").getDouble(0);
    }

    /* public double getAngleY() {
        return table.getEntry("ty").getDouble(0);
    }

    public double getArea() {
        return table.getEntry("ta").getDouble(0);
    }

    public double getSkew() {
        return table.getEntry("ts").getDouble(0);
    } */

    public double isThereTarget() {
        return table.getEntry("tv").getDouble(0);
    }

    public boolean lightOff() {
        return table.getEntry("ledMode").setNumber(1);
    }

    public boolean lightOn() {
        return table.getEntry("ledMode").setNumber(3);
    }
}