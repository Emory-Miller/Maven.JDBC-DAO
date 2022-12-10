package daos;

import models.Car;
import org.junit.Assert;
import org.junit.Test;

public class CarDAOTest {

    @Test
    public void findByIdTest(){
        CarDAO dao = new CarDAO();

        String actual = dao.findById(1).getMake();
        String expected = "Honda";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findAllTest(){
        CarDAO dao = new CarDAO();

        String actual = dao.findAll().get(1).getMake();
        String expected = "Honda";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createTest(){
        CarDAO dao = new CarDAO();

        dao.create(new Car("Honda", "Pilot", 2006, "Silver", 456984));

        String actual = dao.findById(9).getModel();
        String expected = "S2000";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest(){
        CarDAO dao = new CarDAO();

        dao.delete(9);

        Assert.assertNull(dao.findById(9));
    }

    @Test
    public void updateTest() {
        CarDAO dao = new CarDAO();

        dao.update(new Car(8, "Honda", "Pilot", 2006, "Silver", 6540));

        String actual = dao.findById(8).getModel();
        String expected = "Pilot";

        Assert.assertEquals(expected, actual);
    }
}
