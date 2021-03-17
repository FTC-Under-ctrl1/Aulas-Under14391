package org.firstinspires.ftc.teamcode.tensorflow;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="TensorFlow Leitura", group="Pushbot")
public class PrincipalTf extends LinearOpMode {

    TensorFlow tfEngine = new TensorFlow();

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Iniciado");

        tfEngine.initEngine(hardwareMap);

        telemetry.addData("Status", "TensorFlow iniciado");

        waitForStart();

        String quantArg = tfEngine.quantidadeDeArgolas();

        telemetry.addData("Leitura:", "confirmada");

        if (quantArg != null) {
            telemetry.addData("Quantidade", quantArg);
        } else  {
            telemetry.addData("Quantidade", "null");
        }
    }
}
