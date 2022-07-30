package Principal;
import Controlador.ListarModeloDB;
import Modelo.Conexion;
import Modelo.DatosModeloDB;
import Vistas.*;

public class Main {

    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        conexion.getConnection();
        ListarModeloDB listas = new ListarModeloDB();
        listas.getListaGerentes();
        listas.getListaOperarios();
        listas.getListaDomiciliarios();
        
        Login login = new Login();
       
        login.setVisible(true);
    }
}
