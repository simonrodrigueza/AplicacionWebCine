
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Pelicula pel=new Pelicula();
    
    @Override
    public List listar() {
        ArrayList<Pelicula>list=new ArrayList<>();
        String sql="select * from peliculas";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Pelicula p=new Pelicula();
                
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setDuracion(rs.getString("duracion"));
                p.setGenero(rs.getString("genero"));
                p.setAforo(rs.getInt("aforo"));
                p.setSala(rs.getString("sala"));
                p.setHora(rs.getString("hora"));
               
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Pelicula list(int id) {
        String sql="select * from peliculas where id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                pel.setId(rs.getInt("id"));
                pel.setNombre(rs.getString("nombre"));
                pel.setDuracion(rs.getString("duracion"));
                pel.setGenero(rs.getString("genero"));
                pel.setAforo(rs.getInt("aforo"));
                pel.setSala(rs.getString("sala"));
                pel.setHora(rs.getString("hora"));
                
            }
        } catch (Exception e) {
        }
        return pel;
    }

    @Override
    public boolean add(Pelicula p) {
       String sql="insert into peliculas(nombre, duracion, genero, aforo, sala, hora) "
               + "values('"+p.getNombre()+"','"+p.getDuracion()+"','"+p.getGenero()+"','"+p.getAforo()+"','"+p.getSala()+"','"+p.getHora()+"');";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);   
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Pelicula p) {
        String sql="update peliculas set nombre='"+p.getNombre()+"',duracion="+p.getDuracion()+",genero='"+p.getGenero()
                + "',aforo="+p.getAforo()+",sala='"+p.getSala()+"',hora='"+p.getHora()+"' where id="+p.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean reserve(Pelicula p) {
        int n = p.getAforo()-1;
        String sql="update peliculas set aforo="+n+" where id="+p.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from peliculas where id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
