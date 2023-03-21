/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package hospital;

import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public enum NombresHospitales {
    PRINCETON_PLAINSBORO, SEATTLE_GRACE, CENTRAL, NEW_AMSTERDAM;

    public static NombresHospitales nombreHospitalAleatorio() {
        Random random = new Random();
        NombresHospitales[] listaNombres = NombresHospitales.values();
        return listaNombres[random.nextInt(listaNombres.length)];
    }

}
