package com.example.nequiapp;

public class Categoria {
    private String nombre_cat;
    private String desc_cat;
    private String color_cat;
    private String icono_cat;

    public Categoria(String nombre_cat, String desc_cat, String color_cat, String icono_cat) {
        this.nombre_cat = nombre_cat;
        this.desc_cat = desc_cat;
        this.color_cat = color_cat;
        this.icono_cat = icono_cat;
    }

    public String getNombre_cat() {
        return nombre_cat;
    }

    public void setNombre_cat(String nombre_cat) {
        this.nombre_cat = nombre_cat;
    }

    public String getDesc_cat() {
        return desc_cat;
    }

    public void setDesc_cat(String desc_cat) {
        this.desc_cat = desc_cat;
    }

    public String getColor_cat() {
        return color_cat;
    }

    public void setColor_cat(String color_cat) {
        this.color_cat = color_cat;
    }

    public String getIcono_cat() {
        return icono_cat;
    }

    public void setIcono_cat(String icono_cat) {
        this.icono_cat = icono_cat;
    }
}
