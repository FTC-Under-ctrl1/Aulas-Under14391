package org.firstinspires.ftc.teamcode.tensorflow;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Teste Telemetria", group="Pushbot")
public class TesteTelemetria extends LinearOpMode {
    @Override
    public void runOpMode() {
        telemetry.addData("TESTE", "800");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("E:", "L");
        }
    }
}