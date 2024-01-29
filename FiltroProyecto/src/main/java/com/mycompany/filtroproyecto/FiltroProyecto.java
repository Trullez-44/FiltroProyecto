/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.filtroproyecto;

import Controladores.HabilidadController;
import Controladores.NinjaController;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FiltroProyecto {

    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        boolean ciclo = true;
        do{
                        System.out.println("------------------------");
            System.out.println("""
                               GESTION DE NINJAS Y MISIONES DE KONOHAAAAAAAAAAAAA
                               1. Agregar un Ninja
                               2. Listar Ninjas y sus habilidades
                               3. Agregar una habilidad""");
            String option = scan.nextLine();
            switch (option) {
                case "1":
                    System.out.println("No pregunte por que, solo ponga un ID");
                    int ninjaId = Integer.parseInt(scan.nextLine());
                    System.out.println("No pregunte por que, solo ponga un Nombre");
                    String nombre = scan.nextLine();
                    System.out.println("No pregunte por que, solo ponga un Rango");
                    String rango = scan.nextLine();
                    System.out.println("No pregunte por que, solo ponga una Aldea chimba");
                    String aldea = scan.nextLine();
                    if(NinjaController.sendNinja(new Ninja(ninjaId, nombre, rango, aldea))){
                        System.out.println("Correctamente agregao");
                    };
                    break;
                case "2":
                    List<Ninja> NINJAS = NinjaController.getAllNinjas();
        List<Habilidad> HABILIDADES = HabilidadController.getAllHabilidad();
        System.out.println("NINJASSSSSSSSSSSSSDLKJSAFJNDWQRD");
        for (Ninja currentNinja : NINJAS) {
            System.out.println("--------------------------");
            System.out.println(currentNinja.toString());
            for (Habilidad habilidad : HABILIDADES) {
                if (currentNinja.getNinjaId() == habilidad.getNinjaId()) {
                    System.out.println("HABILIDADES DEL NINJAAAAAAAAADJSALKDJSADXSA");
                    System.out.println(habilidad.toString());
                }
                
            }
        }break;
                case "3":
                    System.out.println("No pregunte por que, solo ponga un ID");
                    int ninjaID = Integer.parseInt(scan.nextLine());
                    System.out.println("No pregunte por que, solo ponga un Nombre");
                    String name = scan.nextLine();
                    System.out.println("No pregunte por que, solo ponga una Descripcion");
                    String descripcion = scan.nextLine();
                    if(HabilidadController.sendHabilidad(new Habilidad(ninjaID, name, descripcion))){
                        System.out.println("Correctamente agregao");
                        System.out.println("------------------------");
                    };
                    break;
                default:
                    System.out.println("Saliendo");
                    ciclo = false;
                    break;
            }
        }while(ciclo);
//        System.out.println(HabilidadController.sendHabilidad(new Habilidad(5,"Rasengan","nada")));
        

    }
}
