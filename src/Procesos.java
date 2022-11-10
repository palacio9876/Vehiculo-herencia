import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinTask;

public class Procesos {

  //  AlmacenamientoVehiculos almacenamientoVehiculos = new AlmacenamientoVehiculos();

    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    int opcion = 0;
    public Procesos() {
        crearVehiculo();
    }

    public void crearVehiculo() {
        String menu = "MENU OPCIONES DE VEHICULOS\n";
        menu += "1. Crear Vehiculo Acuatico\n";
        menu += "2. Crear Vehiculo Aereo\n";
        menu += "3. Ver Vehiculos Creados\n";
        menu += "4. Salir\n";


           do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opcion) {
                    case 1:
                        crearAcuatico();
                        break;
                    case 2:
                        crearAereo();
                        break;
                    case 3:
                        verVehiculos();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                        break;
                }
            } while (opcion != 4);

    }
    public void crearAcuatico() {
        crearTipoBarco();
    }
        public void crearTipoBarco(){

            String menu = "¿QUE TIPO DE ACUATICO QUIERE CREAR? \n";
            menu += "1. Barco\n";
            menu += "2. Regresar al menu principal\n";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    tipoBarco();
                    break;
                case 2:
                    crearVehiculo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }



        }

    private void tipoBarco() {
        String menu = "¿QUE TIPO DE BARCO QUIERE CREAR? \n";
        menu += "1. Barco\n";
        menu += "2. Velero\n";
        menu += "3. Regresar al menu principal\n\n";
        menu += "Ingrese una opción\n";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcion) {
            case 1:
                crearBarco();
                break;
            case 2:
                crearVelero();
                break;
            case 3:
                crearVehiculo();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
    }


    public void crearVelero() {
        Velero miVelero = new Velero();
        miVelero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del vehiculo"));
        miVelero.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo")));
        //miVelero.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese el nombre del acuatico"));
        miVelero.setNombreChasis(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del chasis del barco")));
        System.out.println(miVelero);
        vehiculos.add(miVelero);



    }

   public void crearBarco() {
        Barco miBarco= new Barco();
        miBarco.setNombreChasis(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del chasis del barco")));
        miBarco.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo en numeros")));
        //miBarco.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese el nombre del acuatico"));
        miBarco.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del vehiculo"));
        vehiculos.add(miBarco);
    }


    public void crearAereo(){
        String menu = "¿QUE TIPO DE AEREO QUIERE CREAR? \n";
        menu += "1. Avion\n";
        menu += "2. Helicoptero\n";
        menu += "3. Regresar al menu principal\n";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcion) {
            case 1:
                crearAvion();
                break;
            case 2:
                crearHelicoptero();
                break;
            case 3:
                crearVehiculo();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }


    }

    private void crearHelicoptero() {
        Helicoptero miHelicoptero = new Helicoptero();
        miHelicoptero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del vehiculo"));
        miHelicoptero.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo")));
        miHelicoptero.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre del aereo"));
        miHelicoptero.setNombreHelicoptero(JOptionPane.showInputDialog("Ingrese el nombre del helicoptero"));
        miHelicoptero.setNumeroChasis(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del chasis del helicoptero")));
        System.out.println(miHelicoptero);
        vehiculos.add(miHelicoptero);
    }

    private void crearAvion() {
        Avion miAvion = new Avion();
        miAvion.setModeloVehiculo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo")));
        miAvion.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre del aereo"));
        miAvion.setNombreAvion(JOptionPane.showInputDialog("Ingrese el nombre del avion"));
        miAvion.setNumeroChasis(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del chasis del avion")));
        System.out.println(miAvion);
        vehiculos.add(miAvion);
    }

    public void verVehiculos(){
        if(vehiculos.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay vehiculos creados");
        }else{
       imprimirVehiculos();
        }
    }

    public void imprimirVehiculos() {
       for (int i = 0; i < vehiculos.size(); i++) {
           System.out.println(vehiculos.get(i).getModeloVehiculo()
                     + " " + vehiculos.get(i).getNombreVehiculo()
                    );

       }


    }
}
