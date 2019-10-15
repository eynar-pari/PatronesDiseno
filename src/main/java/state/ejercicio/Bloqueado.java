package state.ejercicio;

import java.util.Date;

public class Bloqueado implements IStateCelular
{
    private int count=0;
    private long currentTime=0;
    private int tmpPassword;
    private int password = 123456; //default pwd
    private int timeblocked=15000; // tiempo a bloquear

    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;  // set password
    }

    public void enterPassword(int tmp){
        this.tmpPassword=tmp;
    }
    public void handle()
    {
        long timeToWait=new Date().getTime() - currentTime;
        if (timeToWait >= timeblocked){

            if (password == tmpPassword && count <= 3){
                count++;
                System.out.println("Password Correcto : Desbloqueado , numero de intento #"+count);
                count=0;
            }else {
                count++;
                currentTime=count==3? new Date().getTime():0;
                String tmpMsg=count==3?"[time to wait]"+(timeblocked/1000)+"Segundos":"";
                System.out.println("Intento #"+count+ "Password Incorrecto.... "+tmpMsg);
            }
        }else{
            System.out.println("Debe Esperar "+(timeblocked-timeToWait)/1000+" segundos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count=0;
        }

    }

 }



