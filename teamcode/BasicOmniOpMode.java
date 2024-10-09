package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
@TeleOp(name="TeleOp")
public class BasicOmniOpMode extends Robot {
    @Override
    public void runOpMode() {

        // Ждем нажатия кнопки старт
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        // Работаем пока не нажат стоп
        while (opModeIsActive()) {
            teleop();
        }
    }}
