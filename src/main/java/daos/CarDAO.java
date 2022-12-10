package daos;

import models.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDAO implements DAOInterface<Car> {

    private Car extractCarFromResultSet(ResultSet rs) throws SQLException {
        Car car = new Car();
        car.setId( rs.getInt("id"));
        car.setMake( rs.getString("make") );
        car.setModel(rs.getString("model"));
        car.setYear(rs.getInt("year"));
        car.setColor(rs.getString("color"));
        car.setVin(rs.getInt("vin"));
        return car;
    }

    @Override
    public Car findById(int id) {
        Connection connection = JavaDatabaseConnection.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cars WHERE id =" + id);

            if(rs.next()){
                return extractCarFromResultSet(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Car> findAll() {
        Connection connection = JavaDatabaseConnection.getConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cars");

            List<Car> cars = new ArrayList<>();

            while (rs.next()) {
                Car car = extractCarFromResultSet(rs);
                cars.add(car);
            }
            return cars;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(Car car) {
        Connection connection = JavaDatabaseConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE cars SET make=?, model=?, year=?, color=?, vin=? WHERE id=?");
            ps.setString(1, car.getMake());
            ps.setString(2, car.getModel());
            ps.setInt(3, car.getYear());
            ps.setString(4, car.getColor());
            ps.setInt(5, car.getVin());
            ps.setInt(6, car.getId());
            int i = ps.executeUpdate();

            if(i == 1){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean create(Car car) {
        Connection connection = JavaDatabaseConnection.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO cars VALUES" +
                    "(NULL, ?, ?, ?, ?, ?)");
            ps.setString(1, car.getMake());
            ps.setString(2, car.getModel());
            ps.setInt(3, car.getYear());
            ps.setString(4, car.getColor());
            ps.setInt(5, car.getVin());
            int i = ps.executeUpdate();

            if (i == 1){
                System.out.println("Database updated");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Connection connection = JavaDatabaseConnection.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM cars WHERE id=" + id);

            if (i == 1){
                System.out.println("Information at row" + id + "has been deleted");
            }   return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
