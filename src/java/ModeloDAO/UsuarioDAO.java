/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Santiago
 */
public class UsuarioDAO {


        public boolean autentication(String usuario, String contraseña) {
            Conexion cn = new Conexion();
            PreparedStatement ps=null;
            ResultSet rs=null;
        try {
            String consulta = "select * from usuarios where usuario = ? and pass = ?";
            
            Connection con = cn.getConnection();
            ps = con.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (cn.getConnection() != null) {
                    cn.getConnection().close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return false;
    }

    public boolean registrar(String usuario, String contraseña) {
        Conexion cn = new Conexion();
        PreparedStatement ps=null;

        try {
            String consulta = "insert into usuarios (usuario, pass) values (?,?)";
            Connection con = cn.getConnection();
            ps = con.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            if (ps.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (cn.getConnection() != null) {
                    cn.getConnection().close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return false;
    }

}
