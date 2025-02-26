package com.joao.music_api.model;

public enum Sexo {
    MASCULINO("masculino"),
    FEMININO("feminino"),
    OUTRO("outro");

    private String stringSexo;

    Sexo(String stringSexo) {
        this.stringSexo = stringSexo;
    }

    public static Sexo fromStrig(String texto) {
        for(Sexo sexo : Sexo.values()) {
            if (sexo.stringSexo.equalsIgnoreCase(texto)){
                return sexo;
            }
        }
        throw new IllegalArgumentException("Nenhum conhecido para a string fornecida");
    }

}
