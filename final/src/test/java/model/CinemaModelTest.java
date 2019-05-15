package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaModelTest {

    @Test
    void nrIsInt() {
        CinemaModel cinemaModel = new CinemaModel();
        assertEquals(true,cinemaModel.nrIsInt("+123"));
        assertEquals(false,cinemaModel.nrIsInt("132"));
        assertEquals(false, cinemaModel.nrIsInt("asdasd"));
    }
}