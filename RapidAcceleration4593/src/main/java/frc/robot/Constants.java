package frc.robot;

public class Constants {
    public class driveTrain {
        public static final int FRMPort = 8;
        public static final int RRMPort = 9;
        public static final int FLMPort = 6;
        public static final int RLMPort = 7;

        public static final int ultrasonicPort = 1;
    }

    public class shooter {
        public static final int shooterLeftPort = 10;
        public static final int shooterRightPort = 11;

        public static final int turretPort = 4;

        public static final double shooterFF = .00001;

        public static final double threshold = .5;

        public static final double turnSpeed = .8;

    }

    public class intake {
        public static final int intakeMotorPort = 5;
        public static final int hopperMotorPort = 1;
        public static final int intoShooterMotorPort = 3;
    }

    public class climber {
        public static final int climberMotor1Port = 2;
    }

    public class breakBeam {
        public static final int intakeBreakBeamPort = 3;
        public static final int shooterBreakBeamPort = 2; 
    }

    public class controllers {
        public static final int mainControllerPort = 0;
        public static final int auxControllerPort = 1;
    }

    public class autonomous {
        public static final double optimusRange = 10.5;
        public static final double encoderBackUp = 14;
        
    }

}