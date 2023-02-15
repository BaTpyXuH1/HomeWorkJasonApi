package com.example.homeworkjasonapi.logic;


import com.example.homeworkjasonapi.message.InputMessage;
import com.example.homeworkjasonapi.message.OutputMessage;




// имплементация решателя
public class SolverImpl implements ISolver {
    @Override
    public OutputMessage solve(InputMessage input) {
        if (input.isSquare())
            return new OutputMessage("square : " + input.getCircle().square());
        else return new OutputMessage("length : " + input.getCircle().length());
    }
}
