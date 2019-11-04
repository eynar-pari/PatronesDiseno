package ejercicios7.proxy;

public class File {

    private String nameFile;
    private String extention;

    public File(String nameFile, String extention){
        this.nameFile =nameFile;
        this.extention =extention;
    }
    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

}
