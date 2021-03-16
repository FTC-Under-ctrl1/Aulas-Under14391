package org.firstinspires.ftc.teamcode.tensorflow;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TensorFlow Leitura", group="Linear Opmode")
public class PrincipalTf extends LinearOpMode {

    TensorFlow tfEngine = new TensorFlow();

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Iniciado");

        tfEngine.initEngine(hardwareMap);
        telemetry.addData("Status", "TensorFlow iniciado");

        waitForStart();

        String quantArg = tfEngine.quantidadeDeArgolas();


        if (quantArg != null) {
            telemetry.addData("Quantidade", quantArg);
        } else  {
            telemetry.addData("Quantidade", "null");
        }
    }
}
