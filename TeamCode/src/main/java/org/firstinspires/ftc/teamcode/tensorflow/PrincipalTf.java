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

        while(tfEngine.pilhaArg == null) {
            tfEngine.quantidadeDeArgolas();
        }

        while(opModeIsActive()) {
            String quantArg = tfEngine.pilhaArg;
            switch (quantArg) {
                case "1":
                    telemetry.addData("Quantidade", "Uma argola :)");
                    break;
                case "4":
                    telemetry.addData("Quantidade", "Quatro argola :D");
                    break;
                default:
                    telemetry.addData("Quantidade", "Nenhuma argola :(");
            }
        }
    }
}
