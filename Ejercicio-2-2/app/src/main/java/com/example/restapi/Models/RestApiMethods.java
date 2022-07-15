package com.example.restapi.Models;

public class RestApiMethods {
    private static final String ipaddress = "192.168.0.3";
    public static final String StringHttp = "http://";
    private static final String GetEmple = "/CRUD-PHP/listaempleados.php";
    private static final String CreateEmple = "/CRUD-PHP/crear.php";
    public static final String EndPointGetEmple = StringHttp + ipaddress + GetEmple;
    public static final String EndPointCreateEmple = StringHttp + ipaddress + CreateEmple;
}
