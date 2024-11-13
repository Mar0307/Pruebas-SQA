package com.saucedemo.models;

import lombok.Builder;

import java.util.List;

@Builder
public class InicioSesionModel {
    private String usuario;
    private String contrasena;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public InicioSesionModel() {
    }

    public InicioSesionModel(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }


    private static InicioSesionModel instancia;

    public static synchronized InicioSesionModel getInstancia() {
        if (instancia != null) {
            return instancia;
        }
        instancia = setDataPago();
        return instancia;
    }

    public static InicioSesionModel setDataPago() {
        return InicioSesionModel.builder()
                .usuario("")
                .contrasena("")
                .build();
    }

    public void dataUsuario(List<String> listaDatosUsuario){
        instancia.setUsuario(listaDatosUsuario.get(0));
        instancia.setContrasena(listaDatosUsuario.get(1));

    }
}
