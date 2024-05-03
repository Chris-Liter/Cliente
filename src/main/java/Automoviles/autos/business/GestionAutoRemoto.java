/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automoviles.autos.business;

import Automoviles.autos.model.Autos;
import java.util.List;
/**
 *
 * @author jorge
 */
public interface GestionAutoRemoto {
    void guardar(Autos autos);
    void actualizar(Autos autos);
    Autos getAuto(String dni) throws Exception;
    List<Autos> getAutos();
    void borrar(int id);
}
