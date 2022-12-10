package models;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void constructorTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        int expected = 1;
        int actual = car.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        int expected = 1;
        int actual = car.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIdTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        car.setId(2);
        int expected = 2;
        int actual = car.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMakeTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        String expected = "Nissan";
        String actual = car.getMake();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setMakeTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        car.setMake("Honda");
        String expected = "Honda";
        String actual = car.getMake();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getModelTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        String expected = "GTR-R34";
        String actual = car.getModel();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setModelTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        car.setModel("Silva");
        String expected = "Silva";
        String actual = car.getModel();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getYearTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        int expected = 2002;
        int actual = car.getYear();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setYearTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        car.setYear(2001);
        int expected = 2001;
        int actual = car.getYear();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColorTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        String expected = "Blue";
        String actual = car.getColor();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setColorTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        car.setColor("Black");
        String expected = "Black";
        String actual = car.getColor();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getVinTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        int expected = 123456;
        int actual = car.getVin();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setVinTest(){
        Car car = new Car(1, "Nissan", "GTR-R34", 2002, "Blue", 123456);

        car.setVin(0);
        int expected = 0;
        int actual = car.getVin();

        Assert.assertEquals(expected, actual);
    }

}
