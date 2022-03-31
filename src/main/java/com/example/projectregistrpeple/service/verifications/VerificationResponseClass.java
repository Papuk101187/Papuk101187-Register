package com.example.projectregistrpeple.service.verifications;



import com.example.projectregistrpeple.exception.WrongDataException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Service
public class VerificationResponseClass implements VerificationResponseInterface {


    @Override
    public boolean check(Date date) {


        if (date != null) {

            Date currentDate = new Date();
            Date clientDate = date;

            LocalDate localCurrentDate = convertToLocalDateViaInstant(currentDate);
            LocalDate localClientDate = convertToLocalDateViaInstant(clientDate);
            int age = Period.between(localClientDate, localCurrentDate).getYears();


            if (age <= 0 || age > 100) {
                return false;
            }
            if (age > 0) {
                return true;
            }


        } else {
            try {
                throw new WrongDataException(" arguments of f() are null ");
            } catch (WrongDataException e) {
                e.printStackTrace();
            }
        }


        return false;

    }


    public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }


}
