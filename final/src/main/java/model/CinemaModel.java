package model;

import controller.Controller;
import model.DAO.Foglalas;
import model.DAO.FoglalasDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinemaModel {

    private static Logger logger = LoggerFactory.getLogger(CinemaModel.class);

    private String film;

    private String datum;

    private FoglalasDAO dao;

    public CinemaModel() {
        dao = new FoglalasDAO();
    }

    public void foglalas(String vezeteknev, String keresztnev, String mail, String nr, int id) {
        logger.trace("foglalas-ban");
        if (nrIsInt(nr)) {
            Foglalas foglalas = new Foglalas(vezeteknev, keresztnev, mail, nr, film, datum, id);
            dao.saveFoglalas(foglalas);
        }else{
            System.out.println("Számot kell megadni'");
        }

    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public boolean nrIsInt(String nr){
        if (nr.startsWith("+")) {
            try {
                Double.parseDouble(nr);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }else{
            return false;
        }

    }

}
