package com.pantxi.jeu;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PersonnageTest {

    @Test
    public void testTourner1() {
        Personnage personnage = new Personnage();
        String orientation = personnage.tourner(1);
        assertThat(orientation).isEqualTo("EST");
    }

    @Test
    public void testTourner2() {
        Personnage personnage = new Personnage();
        personnage.tourner(1); // NORD -> EST
        String orientation = personnage.tourner(1); // EST -> SUD
        assertThat(orientation).isEqualTo("SUD");
    }

    @Test
    public void testTourner3() {
        Personnage personnage = new Personnage();
        personnage.tourner(1); // NORD -> EST
        personnage.tourner(1); // EST -> SUD
        String orientation = personnage.tourner(1); // SUD -> OUEST
        assertThat(orientation).isEqualTo("OUEST");
    }

    @Test
    public void testTourner4() {
        Personnage personnage = new Personnage();
        personnage.tourner(3); // NORD -> EST -> SUD -> OUEST
        String orientation = personnage.tourner(1); // OUEST -> NORD
        assertThat(orientation).isEqualTo("NORD");
    }

    @Test
    public void testTournerCompleterUnTour() {
        Personnage personnage = new Personnage();
        personnage.tourner(4); // NORD -> EST -> SUD -> OUEST -> NORD
        String orientation = personnage.tourner(4); // NORD -> EST -> SUD -> OUEST -> NORD
        assertThat(orientation).isEqualTo("NORD");
    }
}

