package org.firstinspires.ftc.teamcode.tensorflow;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="TensorFlow Leitura", group="Pushbot")
public class PrincipalTf extends LinearOpMode {

    TensorFlow tfEngine = new TensorFlow();

    @Override
    public void runOpMode() {
        telemetry.addData("Status: ","Iniciado");
        telemetry.update();
        tfEngine.initEngine(hardwareMap);

        telemetry.addData("Status", "TensorFlow iniciado");
        telemetry.update();

        waitForStart();

        String quantArg = tfEngine.quantidadeDeArgolas();

        telemetry.addData("Leitura", quantArg);
        telemetry.update();

        switch(quantArg) {
            case "Quad":
                telemetry.addData("Quantidade", "Quatro");
                break;
            case "Single":
                telemetry.addData("Quantidade", "Uma");
                break;
            default:
                telemetry.addData("Quantidade", "Nenhuma");
                break;
        }
        tfEngine.deactivate();
    }
}
