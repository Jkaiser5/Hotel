package com.unu.hotel.models;


	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;
    import com.unu.hotel.beans.habitacion;

	public class habitacionModel {

	    private Connection connection;

	    // Constructor para establecer la conexión
	    public habitacionModel() {
	        try {
	            // Establece la conexión con la base de datos (ajustar según tu configuración)
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            this.connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/hotel", "root", "tu_contraseña"); // Cambia estos valores
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    // Método para agregar una nueva habitación
	    public void agregarHabitacion(habitacion habitacion) {
	        String query = "INSERT INTO habitaciones (idHabitacion, tipoHabitacion, descripcion, pDiario, estado) VALUES (?, ?, ?, ?, ?)";
	        try (PreparedStatement pst = connection.prepareStatement(query)) {
	            pst.setInt(1, habitacion.getIdHabitacion());
	            pst.setString(2, habitacion.getTipoHabitacion());
	            pst.setString(3, habitacion.getDescripcion());
	            pst.setDouble(4, habitacion.getpDiario());
	            pst.setString(5, habitacion.getEstado());
	            pst.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Método para obtener todas las habitaciones
	    public List<habitacion> obtenerHabitaciones() {
	        List<habitacion> habitaciones = new ArrayList<>();
	        String query = "SELECT * FROM habitaciones";
	        try (Statement stmt = connection.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {

	            while (rs.next()) {
	                habitacion habitacion = new habitacion(
	                    rs.getInt("idHabitacion"),
	                    rs.getString("tipoHabitacion"),
	                    rs.getString("descripcion"),
	                    rs.getDouble("pDiario"),
	                    rs.getString("estado")
	                );
	                habitaciones.add(habitacion);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return habitaciones;
	    }

	    // Método para obtener una habitación por ID
	    public habitacion obtenerHabitacionPorId(int id) {
	        String query = "SELECT * FROM habitaciones WHERE idHabitacion = ?";
	        try (PreparedStatement pst = connection.prepareStatement(query)) {
	            pst.setInt(1, id);
	            ResultSet rs = pst.executeQuery();
	            if (rs.next()) {
	                return new habitacion(
	                    rs.getInt("idHabitacion"),
	                    rs.getString("tipoHabitacion"),
	                    rs.getString("descripcion"),
	                    rs.getDouble("pDiario"),
	                    rs.getString("estado")
	                );
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    // Método para actualizar una habitación
	    public void actualizarHabitacion(habitacion habitacion) {
	        String query = "UPDATE habitaciones SET tipoHabitacion = ?, descripcion = ?, pDiario = ?, estado = ? WHERE idHabitacion = ?";
	        try (PreparedStatement pst = connection.prepareStatement(query)) {
	            pst.setString(1, habitacion.getTipoHabitacion());
	            pst.setString(2, habitacion.getDescripcion());
	            pst.setDouble(3, habitacion.getpDiario());
	            pst.setString(4, habitacion.getEstado());
	            pst.setInt(5, habitacion.getIdHabitacion());
	            pst.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Método para eliminar una habitación por ID
	    public void eliminarHabitacion(int id) {
	        String query = "DELETE FROM habitaciones WHERE idHabitacion = ?";
	        try (PreparedStatement pst = connection.prepareStatement(query)) {
	            pst.setInt(1, id);
	            pst.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Cerrar la conexión a la base de datos
	    public void cerrarConexion() {
	        try {
	            if (connection != null && !connection.isClosed()) {
	                connection.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

