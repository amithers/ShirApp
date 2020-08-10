package com.example.shirapp.defines;


public final class LogDefs {

    //private c'tor to simulate singleton
    private LogDefs() {

    }
    //Tags
    public static final String tagLogin = "RegisterLogin";
    public static final String tagMenu = "MenuActivity";
    public static final String tagBT = "BtRelated";
    public static final String tagGameScreen = "GameScreen";
    public static final String tagRFID = "Rfid";
    public static final String tagLiveGameInfo = "LiveGameInfo";
    // login and register
    public static final String emailLoginSucMsg = "signInWithEmail:success";
    public static final String emailLoginFailMsg = "signInWithEmail:failure";
    public static final String emailRegisterSucMsg = "createUserWithEmail:success";
    public static final String emailRegisterFailMsg = "createUserWithEmail:failure";
    public static final String emailInvalidlMsg = "email value invalid";
    public static final String passwordInvalidlMsg = "password value invalid";


}

