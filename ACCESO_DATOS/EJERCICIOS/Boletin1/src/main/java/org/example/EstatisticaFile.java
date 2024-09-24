package org.example;

import java.io.File;
import java.util.Date;

public class EstatisticaFile {

    /**
     * Clase EstatisticaFile con atributos y métodos para los archivos.
     *
     * @author: Julio
     * @version: 1.0
     * */

    private File file;
    private int lines;
    private int letters;
    private int spaces;

    public EstatisticaFile (File file) {
        this.file = file;
    }

    public Boolean itExists () {
        if (this.file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public Long lastModified () {
        return this.file.lastModified();
    }

    public String getPath () {
        return this.file.getPath();
    }

    public void sumLines (int lines) {
        this.lines += lines;
    }

    public int getLines () {
        return this.lines;
    }
}
