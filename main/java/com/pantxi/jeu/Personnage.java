package com.pantxi.jeu;

public class Personnage {

        private String orientation = "NORD"; // Orientation initiale

        // Méthode pour faire tourner le personnage dans le sens des aiguilles d'une montre
        public String tourner(int fois) {
            // Tableau des orientations dans le sens des aiguilles d'une montre
            String[] orientations = {"NORD", "EST", "SUD", "OUEST"};

            // Trouver l'index de l'orientation actuelle
            int currentIndex = java.util.Arrays.asList(orientations).indexOf(orientation);

            // Calculer la nouvelle orientation après avoir effectué `fois` quarts de tour
            int newIndex = (currentIndex + fois) % 4;

            // Si l'index est négatif, ajuster pour obtenir un index valide dans le tableau
            if (newIndex < 0) {
                newIndex += 4;
            }

            // Mettre à jour l'orientation du personnage
            orientation = orientations[newIndex];

            // Retourner la nouvelle orientation
            return orientation;
        }
    }


