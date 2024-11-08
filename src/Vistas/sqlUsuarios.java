/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import static Vistas.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author angel
 */
public class sqlUsuarios extends Conexion{
    
        public boolean login(usuarios usr) {
            Connection con = getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT id_usuario, nombre, apellido, correo, pass, tipo_usuario FROM usuario WHERE correo = ?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, usr.getCorreo());
                rs = ps.executeQuery();

                if (rs.next()) {
                    if (usr.getPass().equals(rs.getString(5))) {
                            usr.setId_usuario(rs.getInt(1));
                            usr.setNombre(rs.getString(2));
                            usr.setApellido(rs.getString(3));
                            usr.setTipo_usuario(rs.getString(6));
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            } catch (SQLException e) {
                System.out.println(e);
                return false;
            }
        }

}
