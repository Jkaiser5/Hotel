package com.unu.hotel.models;


	import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
	import java.util.List;
    import com.unu.hotel.beans.reserva;


		public class reservaModel {

		    private Connection connection;

		    // Constructor para establecer la conexión
		    public reservaModel() {
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "tu_contraseña");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

		    // Método para agregar una reserva
		    public void agregarReserva(reserva reserva) {
		        String query = "INSERT INTO reserva (idUsuario, idPersona, idHabitacion, fIngreso, fSalida, fReserva, dias, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		        try (PreparedStatement pst = connection.prepareStatement(query)) {
		            pst.setInt(1, reserva.getIdUsuario());
		            pst.setInt(2, reserva.getIdPersona());
		            pst.setInt(3, reserva.getIdHabitacion());
		            pst.setDate(4, new java.sql.Date(reserva.getfIngreso().getTime()));
		            pst.setDate(5, new java.sql.Date(reserva.getfSalida().getTime()));
		            pst.setDate(6, new java.sql.Date(reserva.getfReserva().getTime()));
		            pst.setInt(7, reserva.getDias());
		            pst.setString(8, reserva.getEstado());
		            pst.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    // Método para obtener todas las reservas
		    public List<reserva> obtenerReservas() {
		        List<reserva> reservas = new ArrayList<>();
		        String query = "SELECT * FROM reserva";
		        try (Statement stmt = connection.createStatement();
		             ResultSet rs = stmt.executeQuery(query)) {

		            while (rs.next()) {
		                reserva reserva = new reserva(
		                    rs.getInt("idReserva"),
		                    rs.getInt("idUsuario"),
		                    rs.getInt("idPersona"),
		                    rs.getInt("idHabitacion"),
		                    rs.getDate("fIngreso"),
		                    rs.getDate("fSalida"),
		                    rs.getDate("fReserva"),
		                    rs.getInt("dias"),
		                    rs.getString("estado")
		                );
		                reservas.add(reserva);
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return reservas;
		    }

		    // Método para actualizar una reserva
		    public void actualizarReserva(reserva reserva) {
		        String query = "UPDATE reserva SET idUsuario = ?, idPersona = ?, idHabitacion = ?, fIngreso = ?, fSalida = ?, fReserva = ?, dias = ?, estado = ? WHERE idReserva = ?";
		        try (PreparedStatement pst = connection.prepareStatement(query)) {
		            pst.setInt(1, reserva.getIdUsuario());
		            pst.setInt(2, reserva.getIdPersona());
		            pst.setInt(3, reserva.getIdHabitacion());
		            pst.setDate(4, new java.sql.Date(reserva.getfIngreso().getTime()));
		            pst.setDate(5, new java.sql.Date(reserva.getfSalida().getTime()));
		            pst.setDate(6, new java.sql.Date(reserva.getfReserva().getTime()));
		            pst.setInt(7, reserva.getDias());
		            pst.setString(8, reserva.getEstado());
		            pst.setInt(9, reserva.getIdReserva());
		            pst.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    // Método para eliminar una reserva
		    public void eliminarReserva(int idReserva) {
		        String query = "DELETE FROM reserva WHERE idReserva = ?";
		        try (PreparedStatement pst = connection.prepareStatement(query)) {
		            pst.setInt(1, idReserva);
		            pst.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    // Método para obtener una reserva por ID
		    public reserva obtenerReservaPorId(int idReserva) {
		        reserva reserva = null;
		        String query = "SELECT * FROM reserva WHERE idReserva = ?";
		        try (PreparedStatement pst = connection.prepareStatement(query)) {
		            pst.setInt(1, idReserva);
		            try (ResultSet rs = pst.executeQuery()) {
		                if (rs.next()) {
		                    reserva = new reserva(
		                        rs.getInt("idReserva"),
		                        rs.getInt("idUsuario"),
		                        rs.getInt("idPersona"),
		                        rs.getInt("idHabitacion"),
		                        rs.getDate("fIngreso"),
		                        rs.getDate("fSalida"),
		                        rs.getDate("fReserva"),
		                        rs.getInt("dias"),
		                        rs.getString("estado")
		                    );
		                }
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return reserva;
		    }

		    // Cerrar la conexión a la base de datos
		    public void cerrarConexion() {
		        try {
		            if (connection != null && !connection.isClosed()) {
		                connection.close();
		            }
		        } catch (SQLException e)            {
		            e.printStackTrace();
		        }
		    }
		}
