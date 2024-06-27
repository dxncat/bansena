package org.adso.bansena;

import java.util.Date;
import java.util.List;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        //fechas
        //region habilitantes
        Decreto decreto = new Decreto(
            new Date(2021, 1, 1),
            new Date(2021, 12, 31),
            1000.0
        );

        ReglaNegocio reglaNegocio = new ReglaNegocio(
            new Date(2021, 1, 1),
            new Date(2021, 12, 31),
            1000.0
        );

        Campaign campaign1 = new Campaign(
            new Date(2021, 1, 1),
            new Date(2021, 12, 31),
            1000.0
        );
        
        Campaign campaign2 = new Campaign(
            new Date(2021, 1, 1),
            new Date(2021, 12, 31),
            1000.0
        );

        //region cuotas manejo
        CuotaManejo cuotaManejoDecreto = new CuotaManejo(decreto);
        CuotaManejo cuotaManejoReglaNegocio = new CuotaManejo(reglaNegocio);
        CuotaManejo cuotaManejoCampaign1 = new CuotaManejo(campaign1);
        CuotaManejo cuotaManejoCampaign2 = new CuotaManejo(campaign2);

        //region cuenta bancaria
        CuentaBancaria cuentaBancaria = new CuentaBancaria(9000.00, 346785, Divisas.USD, List.of(cuotaManejoDecreto, cuotaManejoReglaNegocio, cuotaManejoCampaign1, cuotaManejoCampaign2));

        //region titular
        Titular titular = new Titular("Juan", 123456, List.of(cuentaBancaria));

        System.out.println(titular);

        System.out.println("cuentas del titular");
        for (CuentaBancaria cuenta : titular.getCuentas()) {
            System.out.print("cuenta: ");
            System.out.println(cuenta);
            System.out.print("saldo en cuenta: ");
            System.out.print(cuenta.getSaldo());
            System.out.println();
            for (CuotaManejo cuotaManejo : cuenta.getCuotasManejo()) {
                System.out.print("cuota de manejo: ");
                System.out.println(cuotaManejo);
            }
        }
    }
}