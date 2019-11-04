/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static void main(String[] args) {
        //Variables
        String comprador = "Jaimito";
        String producto = "Patatas";
        String imprevisto = "Piruleta";

        //Cantidad a Comprar
        int cantidadC = 3;
        int patatasComp;
        //Dinero Suministrado
        double dineroS = 1;
        double cambio;

        //Constantes
        //Precio Encargo
        final double precioE = 0.30;

        //Precio Imprevisto
        final double precioI = 0.20;

        System.out.printf("Secuencia de Patatas%n");

        System.out.printf("====================%n");

        System.out.printf("Persona encargada .....: %s%n", comprador);
        System.out.printf("Artículo encargado ....: %s%n", producto);
        System.out.printf("Cantidad encargada ....: %dKg%n", cantidadC);

        System.out.printf("---%n");

        System.out.printf(Locale.ENGLISH, "Precio encargo ........: %.2f€/kg%n", precioE);
        System.out.printf(Locale.ENGLISH, "Dinero suministrado ...: %.2f€%n", dineroS);
        System.out.printf("Artículo imprevisto ...: %s%n", imprevisto);
        System.out.printf(Locale.ENGLISH, "Precio imprevisto .....: %.2f€%n", precioI);

        System.out.printf("---%n");        
        patatasComp = (int)((dineroS - precioI) / precioE);
        System.out.printf("Cantidad comprada .....: %sKG%n", patatasComp);
        cambio = (dineroS - precioI) % precioE;
        System.out.printf(Locale.ENGLISH, "Dinero devuelto .......: %.2f€%n", cambio);
    }
}
