package model.service;

public class USAImpostoService implements ImpostoService {

    @Override
    public double imposto(double montante){
        if (montante <= 0 ){
            return 0.0;
        }
        if (montante <= 100){
            return montante * 0.30;
        }
        else {
            return montante * 0.25;
        }
    }
}
